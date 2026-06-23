package com.demo.model;

import java.time.LocalDate;

public class Vehicle {
private int id;
private double price;
private String vname;
private String model;
private LocalDate mfdt;
public Vehicle() {
	super();
}
public Vehicle(int id,  String vname, double price, String model, LocalDate mfdt) {
	super();
	this.id = id;
	this.price = price;
	this.vname = vname;
	this.model = model;
	this.mfdt = mfdt;
}
@Override
public String toString() {
	return "Vehicle [id=" + id + ", price=" + price + ", vname=" + vname + ", model=" + model + ", mfdt=" + mfdt + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getVname() {
	return vname;
}
public void setVname(String vname) {
	this.vname = vname;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public LocalDate getMfdt() {
	return mfdt;
}
public void setMfdt(LocalDate mfdt) {
	this.mfdt = mfdt;
}

}
