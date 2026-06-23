package com.demo.model;

public abstract class Employee extends Person{
	private String dept;
	private String desig;

	public Employee() {
		super();
		//System.out.println("Default constru of Employee");
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String mob, String dept, String desig) {
		super(id,name,mob);
		//System.out.println("Para constructor of Employee");
		this.dept = dept;
		this.desig = desig;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public abstract double calculateSalary();
	
	
	@Override
	public String toString() {
		return super.toString() + "Employee [dept=" + dept + ", desig=" + desig + "]";
	}
	
	

}
