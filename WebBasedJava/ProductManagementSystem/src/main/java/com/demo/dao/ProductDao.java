package com.demo.dao;

import java.util.List;

import com.demo.model.MyUser;
import com.demo.model.Product;

public interface ProductDao {

	MyUser validateUser(String username, String password);

	List<Product> findAll();



}
