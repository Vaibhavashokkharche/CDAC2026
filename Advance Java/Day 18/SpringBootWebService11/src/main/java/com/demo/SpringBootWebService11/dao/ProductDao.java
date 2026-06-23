package com.demo.SpringBootWebService11.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootWebService11.beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{
	@Query(value="select * from product where price between :lprice and :hprice",nativeQuery = true)
	//@Query(value="select p from Product p where price between :lprice and :hprice") 
	List<Product> findByPrice(double lprice, double hprice);

	
	@Procedure(procedureName = "getCount")
	public int getCount();
}
