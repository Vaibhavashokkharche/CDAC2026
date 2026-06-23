package com.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Product;
import com.demo.service.ProductService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/product")
public class ProductController {
     @Autowired
	ProductService pservice;
	
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
	@PostMapping("/save")
	private String insertProduct( @Valid @ModelAttribute("product") Product product,
    BindingResult result,@RequestParam("image") MultipartFile file) throws IllegalStateException, IOException {
		//System.out.println("in insert product");
		//System.out.println(product);
		//System.out.println(result.toString());
		if (file.isEmpty()) {

            result.rejectValue(
                    "pimagefile",
                    "error.product",
                    "Please select image");
        }
		
		if(result.hasErrors()) {
			System.out.println("in if");
			return "addproduct";
		}else {
			 String fileName = file.getOriginalFilename();
System.out.println("original file name :" +fileName);
		       // String path =servletContext.getRealPath("/uploads/");
		        String path="/user/kishori/Mydata/java_demos/images/";

		       // Files.createDirectories(Paths.get(path));
                System.out.println("Filename : "+path + fileName+product.getPid());
		        file.transferTo(new java.io.File(path + fileName+product.getPid()));

		        product.setPimagefile(path + fileName+product.getPid());
			boolean status=pservice.insertNewProduct(product);
			return "redirect:/product/viewProducts";
		}
	}
}









