package com.demo.SpringBootWebService11.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.demo.SpringBootWebService11.dto.ProductDto;

import jakarta.validation.Valid;

public interface ProductService {

	

	boolean insertNewProduct( ProductDto product);

	boolean deleteById(int pid);

	ProductDto getById(int pid);

	List<ProductDto> getAllProduct();

	boolean updateProduct(ProductDto dto);
	public List<ProductDto> getByPrice(double lprice,double hprice);

}
