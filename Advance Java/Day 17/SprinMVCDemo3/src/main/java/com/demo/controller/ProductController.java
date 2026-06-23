package com.demo.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Product;
import com.demo.service.ProductService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/product")
public class ProductController {
     @Autowired
	ProductService pservice;
     static String upload_folder="/Users/kishori/Mydata/Java_demos/images/";
	
     //step 7: chage getAllProducts
	@GetMapping("/viewProducts")
	public ModelAndView getAllProducts() {
		List<Product> plist=pservice.getAllProduct();
		return new ModelAndView("displayall","plist",plist);
	}
	
	//show form to accept new productDetails
	@GetMapping("/addproduct")
	public String addProductForm(Model model) {
		//pass empty object to save data via form in the object
		model.addAttribute("product",new Product());
		return "addproduct";
	}
	
	
	//retrieve data from form and insert into table
	//step 5: to add image in the table add following function, also modify pdao.insertNewProduct in ProductDaoImpl
	//and then goto addproduct.jsp
	@PostMapping("/save")
	private String insertProduct( @Valid @ModelAttribute("product") Product product,
    BindingResult result,@RequestParam("image") MultipartFile file) throws IllegalStateException, IOException {
		
		System.out.println(result.toString());
		System.out.println("File name is:" + file.getOriginalFilename() );
//		if (file.isEmpty()) {
//
//            result.rejectValue(
//                    "pimagefile",
//                    "error.product",
//                    "Please select image");
//        }
		
		if(result.hasErrors()) {
			System.out.println("in if");
			return "addproduct";
		}else {
			 String fileName = file.getOriginalFilename();
System.out.println("original file name :" +fileName);
		      // String path =servletContext.getRealPath("/uploads/");
		        String path=upload_folder;

		       // Files.createDirectories(Paths.get(path));     //to create folder programettically
                System.out.println("Filename : "+ path + product.getPid()+fileName);
                //to copy file from client machine to server in the path folder
		        file.transferTo(new java.io.File(path + product.getPid()+fileName));

		        product.setPimagefile(product.getPid()+fileName);
			boolean status=pservice.insertNewProduct(product);
			return "redirect:/product/viewProducts";
		}
	}
	
	@GetMapping("/deleteproduct/{pid}")
	public String deleteProductById(@PathVariable("pid") int pid) {
		Product p=pservice.getById(pid);
		//to delete the image
		if(p!=null && p.getPimagefile() !=null) {
			Path parth=Paths.get(upload_folder,p.getPimagefile());
			try {
				Files.deleteIfExists(parth);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		boolean status=pservice.deleteById(pid);
		return "redirect:/product/viewProducts";
	}
	//display image
	//step 9 : add following function to display image from server folder to clients machine and run the program
	@GetMapping("/image/{filename}")
	public void displayImage(
	        @PathVariable("filename") String filename,
	        HttpServletResponse response)
	        throws IOException {
		System.out.println("in displayimage");
System.out.println(filename);
	    File file = new File(
	    		upload_folder,
	            filename);
//File file = new File(filename);
	    if (!file.exists()) {
	        return;
	    }
	    response.setContentType(
	            Files.probeContentType(file.toPath()));
         //stream the image file to clients machine
	    Files.copy(
	            file.toPath(),
	            response.getOutputStream());
	}
}









