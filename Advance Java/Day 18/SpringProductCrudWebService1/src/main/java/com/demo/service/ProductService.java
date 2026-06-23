package com.demo.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.demo.beans.Product;
import com.demo.dto.ProductDto;

import jakarta.validation.Valid;

public interface ProductService {

	

	boolean insertNewProduct( ProductDto product);

	boolean deleteById(int pid);

	ProductDto getById(int pid);

	List<ProductDto> getAllProduct();

	boolean updateProduct(ProductDto dto);

}
