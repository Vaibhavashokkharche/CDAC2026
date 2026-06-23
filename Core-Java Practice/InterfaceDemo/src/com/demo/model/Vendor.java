package com.demo.model;

public class Vendor extends Employee {
	private int noofemp;
	private double chargesperperson;

	public Vendor() {
		super();
		//System.out.println("Default constru Vendor");
	}

	public Vendor(int id, String name, String mob, String dept, String desig, int noofemp, double chargesperperosn) {
		super(id, name, mob, dept, desig);
		//System.out.println("Para constru Vendor");
		this.noofemp = noofemp;
		this.chargesperperson = chargesperperosn;
	}

	public int getNoofemp() {
		return noofemp;
	}

	public void setNoofemp(int noofemp) {
		this.noofemp = noofemp;
	}

	public double getChargesperperosn() {
		return chargesperperson;
	}

	public void setChargesperperosn(double chargesperperosn) {
		this.chargesperperson = chargesperperosn;
	}

	@Override
	public String toString() {
		return super.toString() + "Vendor [noofemp=" + noofemp + ", chargesperperosn=" + chargesperperson + "]";
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return noofemp*chargesperperson;
	}

}
