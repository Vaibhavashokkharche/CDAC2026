package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	boolean addNewProduct();

	boolean deletebyid(int id);

	boolean updateById(int id, String nm);

	List<Product> getAll();

	Product displayById(int id);

	List<Product> displayAsSorted();

}
