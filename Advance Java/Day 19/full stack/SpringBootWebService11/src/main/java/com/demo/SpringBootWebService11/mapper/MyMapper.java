package com.demo.SpringBootWebService11.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.SpringBootWebService11.beans.Product;
import com.demo.SpringBootWebService11.dto.ProductDto;



public class MyMapper {
	private static final String imageURL =
            "http://localhost:8484/product/products/image/";
	
   public static ProductDto toDto(Product p) {
	   ProductDto pdto=new ProductDto();
	   pdto.setPid(p.getPid());
	   pdto.setPname(p.getPname());
	   pdto.setQty(p.getQty());
	   pdto.setPrice(p.getPrice());
	   pdto.setMfgdate(p.getMfgdate().toString());
	   pdto.setCid(p.getCid());
	   if(p.getPimagefile()!=null) {
		   pdto.setImageUrl(imageURL+p.getPimagefile());
	   }
	   return pdto;
	   
	   
   }

   public static Product toEntity(ProductDto pdto) {
	Product p=new Product();
	p.setPid(pdto.getPid());
	p.setPname(pdto.getPname());
	p.setQty(pdto.getQty());
	p.setPrice(pdto.getPrice());
	p.setCid(pdto.getCid());
	if(pdto.getMfgdate()!=null && !pdto.getMfgdate().isEmpty()) {
		p.setMfgdate(LocalDate.parse(pdto.getMfgdate(),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
	}
	return p;
   }
}
