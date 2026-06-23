package com.demo.ProductMicroWebservice1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.ProductMicroWebservice1.beans.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> findByCategory(int cid) {
		 List<Product> list = List.of(
	                new Product(101, "Laptop", 50000.0, 1),
	                new Product(102, "Mobile", 25000.0, 1),
	                new Product(201, "Shirt", 1200.0, 2),
	                new Product(202, "Jeans", 2200.0, 2));

	        return list.stream()
	                .filter(p -> p.getCid()==(cid))
	                .toList();
	}

}
