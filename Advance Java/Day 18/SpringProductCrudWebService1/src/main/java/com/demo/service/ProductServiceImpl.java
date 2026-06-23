package com.demo.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dto.ProductDto;

import jakarta.validation.Valid;
import com.demo.mapper.MyMapper;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
   private ProductDao pdao;
	private static final String  upload_folder="/Users/kishori/Mydata/Java_demos/images/";

	//@Override
	public List<ProductDto> getAllProduct() {
		List<Product> plist= pdao.findAllProduct();
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

		return pdao.saveProduct(p);
	}

	@Override
	public boolean deleteById(int pid) {
		       //to delete the image
		         Product p=pdao.findById(pid);
				if(p!=null && p.getPimagefile() !=null) {
					Path path=Paths.get(upload_folder,p.getPimagefile());
					try {
						Files.deleteIfExists(path);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		return pdao.removeById(pid);
	}

	@Override
	public ProductDto getById(int pid) {
		Product p=pdao.findById(pid);
		//convert image to filename
		
		if(p!=null)
		    return MyMapper.toDto(p);
		else {
			return null;
		}
	}

	@Override
	public boolean updateProduct(ProductDto dto) {
		Product p=MyMapper.toEntity(dto);
		return pdao.modifyProduct(p);
	}

	
}
