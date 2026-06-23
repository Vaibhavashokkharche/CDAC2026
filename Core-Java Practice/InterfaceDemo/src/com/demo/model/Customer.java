package com.demo.model;

public class Customer extends Person {
private String address;
private String typeofcust;
public Customer() {
	super();
}
public Customer(int id, String name, String mob, String address, String typeofcust) {
	super(id, name, mob);
	this.address = address;
	this.typeofcust = typeofcust;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getTypeofcust() {
	return typeofcust;
}
public void setTypeofcust(String typeofcust) {
	this.typeofcust = typeofcust;
}
@Override
public String toString() {
	return super.toString()+"Customer [address=" + address + ", typeofcust=" + typeofcust + "]";
}


}
