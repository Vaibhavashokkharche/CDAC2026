package com.demo.model;

public class SalaryEmp extends Employee {
private double bonus;
private double salary;
public SalaryEmp() {
	super();
	//System.out.println("Default const of SalaryEmp");
}
public SalaryEmp(int id, String name, String mob, String dept, String desig, double bonus, double salary) {
	super(id, name, mob, dept, desig);
	//System.out.println("para const of SalaryEmp");
	this.bonus = bonus;
	this.salary = salary;
}
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return super.toString()+"SalaryEmp [bonus=" + bonus + ", salary=" + salary + "]";
}
@Override
public double calculateSalary() {
	System.out.println("SalaryEmp CalculateSalaery");
	return salary+0.5*salary+ 0.10*salary;
}


}
