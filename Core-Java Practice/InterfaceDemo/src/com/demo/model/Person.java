package com.demo.model;

public class Person {
	private int id;
	private String name;
	private String mob;

	public Person() {
		super();
		//System.out.println("Default contructor of Person");
	}

	public Person(int id, String name, String mob) {
		super();
		//System.out.println("Parameterized constructor of person");
		this.id = id;
		this.name = name;
		this.mob = mob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mob=" + mob + "]";
	}
	

}
