package com.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {
    @Id
	private int empid;
	private String ename;
	private String desig;
	private Double sal;
	private LocalDate ldt;

	public Employee() {
		super();
	}

	public Employee(int empid, String ename, String desig, Double sal, LocalDate ldt) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.desig = desig;
		this.sal = sal;
		this.ldt = ldt;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public LocalDate getLdt() {
		return ldt;
	}

	public void setLdt(LocalDate ldt) {
		this.ldt = ldt;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", desig=" + desig + ", sal=" + sal + ", ldt=" + ldt
				+ "]";
	}

}
