package com.demo.test;

import com.demo.arrays.My2DArray;

public class TestMy2DArray {

	public static void main(String[] args) {
		My2DArray ob=new My2DArray();
		ob.acceptData();
		ob.displayData();
		System.out.println("-----------------------");
		//System.out.println(ob.isIdentity());
		//System.out.println(ob.isSymmetric());
		ob.rowRotate(true, 2);
		ob.displayData();
		System.out.println("-----------------------");
		ob.columnRotate(true, 2);
		ob.displayData();
		My2DArray ob1=new My2DArray();
		ob1.acceptData();
		ob1.displayData();
		int[][] sum=ob.add2DArray(ob1);
		My2DArray ob2=new My2DArray(sum);
		ob2.displayData();
	}

}
