package com.demo;

import java.util.Date;

public class TestStudent {
	public static void main(String[] args) {
		Student s=new Student(12,"Ashu",67,78,67,new Date());
		System.out.println(s);  //toString
		Student s1=new Student(13,"Deepa",66,77,65,new Date());
		System.out.println(s1);
		System.out.println(s1.getSname());
		Student s2=new Student();
		s2.setSid(14);
		s2.setSname("Sangeeta");
		s2.setM1(88);
		s2.setM2(77);
		s2.setM3(88);
		s2.setJdate(new Date());
		System.out.println(s2);
		
	}
}
