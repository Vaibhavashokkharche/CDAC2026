package com.example.SpringBootTesting.service;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.SpringBootTesting.beans.Product;
import com.example.SpringBootTesting.dao.ProductDao;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductDao productDao;

    @InjectMocks
    private ProductServiceImpl productService;

    @Test
    void testSaveProduct() {

        Product product =
                new Product(101, "Laptop", 10,
                        50000.0, LocalDate.now());

        when(productDao.save(product))
                .thenReturn(product);

        Product savedProduct =
                productService.saveProduct(product);

        assertNotNull(savedProduct);
        assertEquals(101, savedProduct.getPid());

        verify(productDao, times(1))
                .save(product);
    }

    @Test
    void testGetProductById() {

        Product product =
                new Product(101, "Laptop", 10,
                        50000.0, LocalDate.now());

        when(productDao.findById(101))
                .thenReturn(Optional.of(product));

        Product result =
                productService.getProductById(101);

        assertEquals("Laptop",
                result.getPname());

        verify(productDao).findById(101);
    }

    @Test
    void testGetAllProducts() {

        List<Product> products =
                Arrays.asList(
                        new Product(101, "Laptop",
                                10, 50000.0,
                                LocalDate.now()),

                        new Product(102, "Mouse",
                                20, 500.0,
                                LocalDate.now())
                );

        when(productDao.findAll())
                .thenReturn(products);

        List<Product> result =
                productService.getAllProducts();

        assertEquals(2, result.size());

        verify(productDao).findAll();
    }

    @Test
    void testUpdateProduct() {

        Product oldProduct =
                new Product(101, "Laptop",
                        10, 50000.0,
                        LocalDate.now());

        Product newProduct =
                new Product(101, "Gaming Laptop",
                        20, 70000.0,
                        LocalDate.now());

        when(productDao.findById(101))
                .thenReturn(Optional.of(oldProduct));

        when(productDao.save(any(Product.class)))
                .thenReturn(newProduct);

        Product updated =
                productService.updateProduct(newProduct);

        assertEquals("Gaming Laptop",
                updated.getPname());

        assertEquals(70000.0,
                updated.getPrice());

        verify(productDao).findById(101);
        verify(productDao).save(any(Product.class));
    }

    @Test
    void testDeleteProduct() {

        Product product =
                new Product(101, "Laptop",
                        10, 50000.0,
                        LocalDate.now());

        when(productDao.findById(101))
                .thenReturn(Optional.of(product));

        doNothing().when(productDao)
                .deleteById(101);

        productService.deleteProduct(101);

        verify(productDao).findById(101);
        verify(productDao).deleteById(101);
    }

    @Test
    void testProductNotFound() {

        when(productDao.findById(999))
                .thenReturn(Optional.empty());

        RuntimeException ex =
                assertThrows(RuntimeException.class,
                        () -> productService.getProductById(999));

        assertEquals("Product not found : 999",
                ex.getMessage());
    }
}