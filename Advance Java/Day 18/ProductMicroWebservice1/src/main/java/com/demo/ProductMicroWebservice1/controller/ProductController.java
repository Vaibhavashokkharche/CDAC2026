package com.demo.ProductMicroWebservice1.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ProductMicroWebservice1.beans.Product;
import com.demo.ProductMicroWebservice1.service.ProductService;



@RestController
public class ProductController {
	
	@Autowired
	ProductService pservice;

    @GetMapping("/products/category/{cid}")
    public List<Product> getProductsByCategory(@PathVariable Integer cid) {
                 List<Product> plist=pservice.findByCategory(cid);
                 return plist;
       
    }
}
