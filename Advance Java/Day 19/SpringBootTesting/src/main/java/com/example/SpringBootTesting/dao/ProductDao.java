package com.example.SpringBootTesting.dao;



import java.util.List;
import java.util.Optional;

import com.example.SpringBootTesting.beans.Product;



public interface ProductDao {

    Product save(Product product);

    Optional<Product> findById(Integer pid);

    List<Product> findAll();

    void deleteById(Integer pid);
}
