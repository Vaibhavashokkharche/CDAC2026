package com.example.SpringBootTesting.service;


import java.util.List;

import com.example.SpringBootTesting.beans.Product;



public interface ProductService {

    Product saveProduct(Product product);

    Product getProductById(Integer pid);

    List<Product> getAllProducts();

    Product updateProduct(Product product);

    void deleteProduct(Integer pid);
}