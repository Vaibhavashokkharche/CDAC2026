package com.demo;

public class TestPerson {

	public static void main(String[] args) {
		Person p1=new Person("Sanjay","44444444");
		System.out.println(p1);
		
		Person p2=new Person("Gauri","55555");
		System.out.println(p2);
			
		Person p3=new Person();
		p3.setPname("Ashu");
		p3.setMob("44444");
		System.out.println(p3);

	}

}
