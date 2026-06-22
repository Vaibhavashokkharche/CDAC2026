package com.demo.service;

import java.util.List;

import com.demo.model.MyUser;
import com.demo.model.Product;

public interface ProductService {

	MyUser authenticateUser(String username, String password);

	List<Product> getAll();

}
