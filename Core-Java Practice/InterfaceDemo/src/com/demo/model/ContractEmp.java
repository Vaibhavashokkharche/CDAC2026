package com.demo.model;

public class ContractEmp extends Employee {
	private float hrs;
	private double charges;

	public ContractEmp() {
		super();
	}

	public ContractEmp(int id, String name, String mob, String dept, String desig, float hrs, double charges) {
		super(id, name, mob, dept, desig);
		//System.out.println("para constr contraemp");
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
		return super.toString() + "ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return hrs*charges;
	}
	
	
	
}
