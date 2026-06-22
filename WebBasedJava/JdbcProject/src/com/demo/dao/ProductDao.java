package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {

	boolean save(Product p);

	boolean removebyid(int id);

	boolean modifiedById(int id, String nm);

	List<Product> findAll();

	Product findByid(int id);

	List<Product> displayAsSorted();

}
