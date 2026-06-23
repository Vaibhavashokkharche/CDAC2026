package com.demo.model;

public class Vehicle {
	private int id;
	private String vname;
	private double price;

	public Vehicle() {
		super();
	}

	public Vehicle(int id, String vname, double price) {
		super();
		this.id = id;
		this.vname = vname;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vname=" + vname + ", price=" + price + "]";
	}

}
