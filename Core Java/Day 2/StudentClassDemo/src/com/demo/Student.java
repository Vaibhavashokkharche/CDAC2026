package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private int sid;
	private String sname;
	private float m1;
	private float m2;
	private float m3;
	private Date jdate;
	
	//default constructor
	public Student() {
		System.out.println("In student default constructor");
		sid=0;
		sname=null;
		this.m1=0f;
		this.m2=0f;
		this.m3=0f;
		jdate=null;

	}
	
	//parametrized constructor
	public Student(int id,String nm,float m1,float m2,float m3,Date jdt) {
		System.out.println("In student parametrised constructor");
		this.sid=id;
		sname=nm;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		jdate=jdt;
		
	}
	
	/*public void display() {
		System.out.println("Id: "+sid);
		System.out.println("Name: "+sname);
		System.out.println("m1: "+m1);
		System.out.println("m2: "+m2);
		System.out.println("m3: "+m3);
		System.out.println("joining date : "+jdate);
	}*/
	//setter and getter methods
	public void setSid(int s) {
		sid=s;
	}
	public int getSid() {
		return sid;
		
	}
	public void setSname(String s) {
		sname=s;
	}
	public String getSname() {
		return sname;
		
	}
	public void setM1(float s) {
		m1=s;
	}
	public float getM1() {
		return m1;
		
	}
	public void setM2(float s) {
		m2=s;
	}
	public float getM2() {
		return m2;
		
	}
	public void setM3(float s) {
		m3=s;
	}
	public float getM3() {
		return m3;
		
	}
	public void setJdate(Date s) {
		jdate=s;
	}
	public Date getDate() {
		return jdate;
		
	}
	
	public String toString() {
		System.out.println("in student toString method");
		//to convert java date into String format dd/MM/yyyy
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String str=sdf.format(jdate);
		return "Id: "+sid+" Name: "+sname+" M1: "+m1+" M2:"+m2+" m3:" +m3+"Date: "+str;
	}
	
	
	

}
