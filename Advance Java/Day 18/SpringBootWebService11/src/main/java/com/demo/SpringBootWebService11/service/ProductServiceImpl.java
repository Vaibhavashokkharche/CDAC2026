package com.demo.SpringBootWebService11.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.demo.SpringBootWebService11.beans.Product;
import com.demo.SpringBootWebService11.dao.ProductDao;
import com.demo.SpringBootWebService11.dto.ProductDto;
import com.demo.SpringBootWebService11.mapper.MyMapper;

import jakarta.validation.Valid;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
   private ProductDao pdao;
	private static final String  upload_folder="/Users/kishori/Mydata/Java_demos/images/";

	//@Override
	public List<ProductDto> getAllProduct() {
		List<Product> plist= pdao.findAll();
		/*List<ProductDto> plst=new ArrayList<>();
		for(Product p:plist) {
			ProductDto p1=MyMapper.toDto(p);
			plst.add(p1);
		}
		return plst;*/
		
		//List<ProductDto> plst=plist.stream().map(p->MyMapper.toDto(p));
		List<ProductDto> plst=plist.stream()
				                                      .map(MyMapper::toDto)
				                                      .collect(Collectors.toList());
      return plst;
	}

	@Override
	public boolean insertNewProduct( ProductDto pdto)  {
		Product p=MyMapper.toEntity(pdto);
		if (pdto.getImage() != null &&
                !pdto.getImage().isEmpty()) {

            String fileName =
                    pdto.getPid()
                    + pdto.getImage()
                           .getOriginalFilename();    //System.currentTimeMillis() to make filename unique using time
            //transfer file from client to server
            try {
				pdto.getImage().transferTo(
				        new File(
				        		upload_folder+ fileName));
				 p.setPimagefile(fileName);
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            
        }

		Product p1=pdao.save(p);
		return p1!=null;
	}

	@Override
	public boolean deleteById(int pid) {
		       //to delete the image
		         Optional<Product> p1=pdao.findById(pid);
		         if(p1.isPresent()) {
		        	 Product p=p1.get();
		        	 if(p!=null && p.getPimagefile() !=null) {
							Path path=Paths.get(upload_folder,p.getPimagefile());
							try {
								//delete image file from upload_folder from the server
								Files.deleteIfExists(path);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
				   pdao.deleteById(pid);
				   return true;
		         }
		         return false;
				
	}

	@Override
	public ProductDto getById(int pid) {
		Optional<Product> p1=pdao.findById(pid);
		if(p1.isPresent()) {
			Product p=p1.get();
			if(p!=null)
			    return MyMapper.toDto(p);
			else {
				return null;
			}
		}
		return null;
		
	}

	@Override
	public boolean updateProduct(ProductDto dto) {
		Product prod=MyMapper.toEntity(dto);
		Optional<Product> p1=pdao.findById(prod.getPid());
		if(p1.isPresent()) {
			Product p=p1.get();
			p.setPname(prod.getPname());
			p.setQty(prod.getQty());
			p.setPrice(prod.getPrice());
			p.setMfgdate(prod.getMfgdate());
			p.setCid(prod.getCid());
		   Product p2=pdao.save(p);
		   return p2!=null;
	}
  return false;
	}
	
	public List<ProductDto> getByPrice(double lprice,double hprice){
		List<Product> plist=pdao.findByPrice(lprice,hprice);
		if(plist.size()>0) {
			List<ProductDto> plst=plist.stream()
					.map(MyMapper::toDto)
					.collect(Collectors.toList());
			return plst;
		}
		return null;
	}
	
}
