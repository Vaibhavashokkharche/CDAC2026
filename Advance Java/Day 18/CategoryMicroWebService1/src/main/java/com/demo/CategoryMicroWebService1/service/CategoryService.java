package com.demo.CategoryMicroWebService1.service;

import com.demo.CategoryMicroWebService1.beans.Category;
import com.demo.CategoryMicroWebService1.dto.CategoryDTo;

public interface CategoryService {
	 public Category getCategoryById(int cid);

	 public CategoryDTo getProductsByCid(int cid);
}
