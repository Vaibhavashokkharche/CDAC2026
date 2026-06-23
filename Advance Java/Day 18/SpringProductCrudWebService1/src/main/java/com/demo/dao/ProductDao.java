package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> findAllProduct();

	boolean saveProduct(Product product);

	boolean removeById(int pid);

	Product findById(int pid);

	boolean modifyProduct(Product p);

}
