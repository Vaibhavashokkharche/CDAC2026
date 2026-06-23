package com.demo.model;

public class Circle extends Shape {
	private int radius;

	public Circle() {
		super();
	}

	public Circle(String c,int radius) {
		super(c);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + "]";
	}

	@Override
	public float calcArea() {
		return 3.142f*radius*radius;
	}

	@Override
	public float calcPerimeter() {
		return 2*3.142f*radius;
	}
	
	public void m1() {
		System.out.println("in circle m1 method");
		
	}
	

}
