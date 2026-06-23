package com.demo.model;

public class ContractEmp  extends Employee{
	private float hrs;
	private double charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int id,String nm,String m,String dept, String desg,float hrs, double charges) {
		super(id,nm,m,dept,desg);
		this.hrs = hrs;
		this.charges = charges;
	}
	public float getHrs() {
		return hrs;
	}
	public void setHrs(float hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}
	@Override
	public double calculateSal() {
		System.out.println("in contractemp calcculatesal");
		return hrs*charges;
	}
	

}
