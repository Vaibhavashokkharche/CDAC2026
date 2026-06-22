package com.demo.service;

import java.util.List;

import com.demo.dao.CategoryDao;
import com.demo.dao.CategoryDaoImpl;

import com.demo.model.Category;

public class CategoryServiceImp implements CategoryService {
	private CategoryDao cdao;

	public CategoryServiceImp() {
	cdao=new CategoryDaoImpl();
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return cdao.findAllCategories();
	}
	
	

}
