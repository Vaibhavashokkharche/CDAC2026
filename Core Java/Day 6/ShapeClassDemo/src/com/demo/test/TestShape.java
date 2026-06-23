package com.demo.test;

import com.demo.model.Circle;
import com.demo.model.Shape;


public class TestShape {

	public static void main(String[] args) {
		 Shape s=new Circle("red",5);
		 System.out.println("Area :"+ s.calcArea());
		 System.out.println("perimeter"+s.calcPerimeter());
		 //child specific method
		 ((Circle) s).m1();
		 System.out.println(s instanceof Circle);
		 System.out.println(s instanceof Shape);
		 Object ob=s;
		 
	}

}
