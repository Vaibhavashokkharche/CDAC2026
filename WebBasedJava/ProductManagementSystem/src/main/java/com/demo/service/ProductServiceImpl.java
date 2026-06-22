package com.demo.service;

import java.util.List;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.MyUser;
import com.demo.model.Product;

public class ProductServiceImpl implements ProductService {
	private ProductDao pdao;
	public ProductServiceImpl() {
		pdao=new ProductDaoImpl()
;	}
	

	@Override
	public MyUser authenticateUser(String username, String password) {
	
		return pdao.validateUser(username,password);
	}


	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return pdao.findAll();
	}

}
