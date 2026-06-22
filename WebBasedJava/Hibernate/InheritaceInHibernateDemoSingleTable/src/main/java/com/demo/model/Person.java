package com.demo.model;

import org.hibernate.boot.model.source.spi.InheritanceType;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;

@Entity
@Table(name="Personinheritance")
@Inheritance(strategy =jakarta.persistence.InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="personType",discriminatorType = DiscriminatorType.STRING)
public class Person {

	
@Id
	private int id;
	private String name;
	private String mob;

	public Person() {
		super();
	}

	public Person(int id, String name, String mob) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMob() {
		return mob;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mob=" + mob + "]";
	}

}
