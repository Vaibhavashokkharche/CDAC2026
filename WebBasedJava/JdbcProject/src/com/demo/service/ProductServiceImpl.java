package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;

public class ProductServiceImpl implements ProductService{
	private ProductDao pdao;

	
	

	public ProductServiceImpl() {
		pdao=new ProductDaoImpl();
	}




	@Override
	public boolean addNewProduct() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter pnmae");
		String nm=sc.next();
		System.out.println("enter qty");
		int qty=sc.nextInt();
		System.out.println("enter price");
		double price= sc.nextDouble();
		System.out.println("enter a date in dd/MM/yyyy");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Product p= new Product(pid,nm,qty,price,ldt);
		return pdao.save(p);
	}




	@Override
	public boolean deletebyid(int id) {
		// TODO Auto-generated method stub
		return pdao.removebyid(id);
	}




	@Override
	public boolean updateById(int id, String nm) {
		// TODO Auto-generated method stub
		return pdao.modifiedById(id,nm);
	}




	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return pdao.findAll();
	}




	@Override
	public Product displayById(int id) {
		// TODO Auto-generated method stub
		return pdao.findByid(id);
	}




	@Override
	public List<Product> displayAsSorted() {
		// TODO Auto-generated method stub
		return pdao.displayAsSorted();
	}

}
