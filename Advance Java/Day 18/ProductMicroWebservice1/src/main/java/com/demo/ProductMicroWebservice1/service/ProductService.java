package com.demo.ProductMicroWebservice1.service;

import java.util.List;

import com.demo.ProductMicroWebservice1.beans.Product;

public interface ProductService {

	

	List<Product> findByCategory(int cid);

}
