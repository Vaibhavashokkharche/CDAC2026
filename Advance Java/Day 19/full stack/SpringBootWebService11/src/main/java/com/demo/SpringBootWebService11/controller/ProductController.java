package com.demo.SpringBootWebService11.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.demo.SpringBootWebService11.dto.ProductDto;
import com.demo.SpringBootWebService11.service.ProductService;

import jakarta.servlet.http.HttpServletResponse;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService pservice;
	static String upload_folder="/Users/kishori/Mydata/Java_demos/images/";
	
	//retrieve all products
	@GetMapping("/products")
	public ResponseEntity<List<ProductDto>> getAllProducts(){
		//ok function will assign status=200
		return ResponseEntity.ok(pservice.getAllProduct());
		
	}
	
	//retrieve one product
	@GetMapping("/products/{pid}")
	public ResponseEntity<ProductDto> getProductById(@PathVariable("pid") int pid){
		//ok function will assign status=200
		ProductDto p1=pservice.getById(pid);
		if(p1!=null) {
		      return ResponseEntity.ok(p1);
		}else {
			return ResponseEntity.ok(null);
		}
	}
	
	//add a new product
	@PostMapping("/products/{pid}")
	public ResponseEntity<String> save(
	        @ModelAttribute ProductDto dto,
	        @RequestParam("image") MultipartFile image) {
        dto.setImage(image);
        boolean status=pservice.insertNewProduct(dto);
        if(status) {
              return ResponseEntity.ok("Product Saved");
        } else {
        return ResponseEntity.status(500).body("Product not added");
        }
    }
	
	
	//add a new product
		@PutMapping("/products/{pid}")
		public ResponseEntity<String> updateProduct(
		        @ModelAttribute ProductDto dto) {
	        //dto.setImage(image);
	        boolean status=pservice.updateProduct(dto);
	        if(status) {
	              return ResponseEntity.ok("Product updated");
	        } else {
	        return ResponseEntity.status(500).body("Product not updated");
	        }
	    }
		
		@DeleteMapping("/products/{pid}")
		public ResponseEntity<String> deleteProduct(@PathVariable("pid") int pid){
			boolean status=pservice.deleteById(pid);
			if(status) {
	              return ResponseEntity.ok("Product deleted");
	        } else {
	        return ResponseEntity.status(500).body("Product not deleted");
	        }
		}
		
		@GetMapping("/products/{lowprice}/{highprice}")
		public ResponseEntity<List<ProductDto>> getProductsByPrice(@PathVariable("lowprice") double lprice,@PathVariable("highprice") double hprice){
			List<ProductDto> plst=pservice.getByPrice(lprice,hprice);
			if (plst!=null) {
				return ResponseEntity.ok(plst);
			}else {
				return (ResponseEntity<List<ProductDto>>) ResponseEntity.notFound();
			}
		}
	
		//display image
		//step 9 : add following function to display image from server folder to clients machine and run the program
	/*	@GetMapping("/image/{filename}")
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
		}*/
		
		@GetMapping("/image/{filename}")
		public ResponseEntity<byte[]> displayImage(
		        @PathVariable String filename)
		        throws IOException {

		    File file = new File(upload_folder, filename);

		    if (!file.exists()) {
		        return ResponseEntity.notFound().build();
		    }

		    byte[] imageBytes = Files.readAllBytes(file.toPath());

		    return ResponseEntity.ok()
		            .header("Content-Type",
		                    Files.probeContentType(file.toPath()))
		            .body(imageBytes);
		}
	
	
	
	

}
