package com.demo.model;

import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Address {
	@Id
	private int aid;
	private String street;
	private String city;
	private String state;
	@ManyToMany(mappedBy="addrset")
	private Set<Person> studset;

	public Address() {
		super();
	}

	public Address(int aid, String street, String city, String state, Set<Person> studset) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.studset = studset;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Set<Person> getStudset() {
		return studset;
	}

	public void setStudset(Set<Person> studset) {
		this.studset = studset;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", state=" + state + ", studset="
				+ studset + "]";
	}
   
   
   
   

}
