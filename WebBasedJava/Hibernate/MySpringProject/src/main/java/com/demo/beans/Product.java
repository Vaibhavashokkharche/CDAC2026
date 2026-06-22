package com.demo.beans;

import java.time.LocalDate;

public class Product {
	
	private int pid;
	private String pname;
	private int qty;
	private double price;
	private LocalDate ldt; //object of local date
	public Product() {
		super();
		System.out.println("default constructor product is called");
	}
	public Product(int pid, String pname, int qty, double price, LocalDate ldt) {
		
		super();
		System.out.println("para constructor of product is called");
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.ldt = ldt;
	}
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public int getQty() {
		return qty;
	}
	public double getPrice() {
		return price;
	}
	public LocalDate getLdt() {
		return ldt;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setLdt(LocalDate ldt) {
		this.ldt = ldt;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", ldt=" + ldt + "]";
	}
	
	
	
}
