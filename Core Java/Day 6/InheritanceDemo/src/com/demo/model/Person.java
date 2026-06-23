package com.demo.model;

public class Person {
	private int pid;
	private String pname;
	private String mob;
	public Person() {
		System.out.println("in Person default constructor");
	}
	public Person(int pid, String pname, String mob) {
		System.out.println("in Person parametrised constructor");
		this.pid = pid;
		this.pname = pname;
		this.mob = mob;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mob=" + mob + "]";
	}
	

}
