package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

import jakarta.validation.Valid;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
private ProductDao pdao;

	@Override
	public List<Product> getAllProduct() {
		
		
		return pdao.findAllProduct();
	}


	

	@Override
	public boolean insertNewProduct(Product product) {
		// TODO Auto-generated method stub
		return pdao.addNewProduct(product);
	}




	@Override
	public Product getProductById(int pid) {
		
		return pdao.findProductById(pid);
	}




	@Override
	public boolean updateProductById( Product product) {
		
		return pdao.modifiedById(product);
	}




	@Override
	public boolean deleteById(int pid) {
		// TODO Auto-generated method stub
		return pdao.removeById(pid);
	}
}
