package com.demo.beans;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="customermap")
public class Customer extends Person {

	private String address;
	private String type;

	public Customer() {
		super();
	}

	public Customer(int id, String name, String mob,String address, String type) {
		super(id,name,mob);
		this.address = address;
		this.type = type;
	}
	public String getAddress() {
		return address;
	}

	public String getType() {
		return type;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	
	@Override
	public String toString() {
		return "Customer [address=" + address + ", type=" + type + "]";
	}
}
