package com.demo;

public class MyClass implements MyInterface,MyInterface2 {

	@Override
	public void m1() {
		System.out.println("in m1 method");
	}

	@Override
	public int m2(int x) {
		System.out.println("in m2 method");
		return 0;
	}
	
	@Override
	public void m3() {
		MyInterface.super.m3();
		MyInterface2.super.m3();
		System.out.println("in m3 method in myclass");
	}
	
	public void mymethod1() {
		System.out.println("in mymethod1");
	}

	@Override
	public void m11() {
		// TODO Auto-generated method stub
		
	}

}
