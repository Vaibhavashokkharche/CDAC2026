package com.demo.CategoryMicroWebService1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.CategoryMicroWebService1.beans.Category;
import com.demo.CategoryMicroWebService1.dto.CategoryDTo;
import com.demo.CategoryMicroWebService1.service.CategoryService;

@RestController
public class CategoryController {
	@Autowired
	CategoryService cservice;

	 @GetMapping("/category/{cid}")
	public ResponseEntity<Category> getById(@PathVariable("cid") int cid){
		 Category c=cservice.getCategoryById(cid);
		 if(c!=null) { 
		      return ResponseEntity.ok(c);
		 }else {
			 return (ResponseEntity<Category>) ResponseEntity.notFound();
		 }
	}
	 
	 @GetMapping("/categories/category/{cid}")
		public ResponseEntity<CategoryDTo> getProductsByCategoryId(@PathVariable("cid") int cid){
			 CategoryDTo cdto=cservice.getProductsByCid(cid);
			 
			 if(cdto!=null) { 
			      return ResponseEntity.ok(cdto);
			 }else {
				 return (ResponseEntity<CategoryDTo>) ResponseEntity.notFound();
			 }
		}
}
