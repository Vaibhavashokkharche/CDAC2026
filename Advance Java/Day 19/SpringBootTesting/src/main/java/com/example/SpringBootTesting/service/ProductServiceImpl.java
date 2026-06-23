package com.example.SpringBootTesting.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringBootTesting.beans.Product;
import com.example.SpringBootTesting.dao.ProductDao;



@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product saveProduct(Product product) {
        return productDao.save(product);
    }

    @Override
    public Product getProductById(Integer pid) {

        return productDao.findById(pid)
                .orElseThrow(() ->
                new RuntimeException("Product not found : " + pid));
    }

    @Override
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    @Override
    public Product updateProduct(Product product) {

        Product existingProduct =
                productDao.findById(product.getPid())
                .orElseThrow(() ->
                new RuntimeException("Product not found"));

        existingProduct.setPname(product.getPname());
        existingProduct.setQty(product.getQty());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setMfgDate(product.getMfgDate());

        return productDao.save(existingProduct);
    }

    @Override
    public void deleteProduct(Integer pid) {

        productDao.findById(pid)
                .orElseThrow(() ->
                new RuntimeException("Product not found"));

        productDao.deleteById(pid);
    }
}
