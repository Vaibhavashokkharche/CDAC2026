package com.demo;

public class HelloWorld {
	public static int add(int a,int b) {
		return a+b;
	}	
	public static int add(int a,int b,int c) {
		
		return a+b+c;
	}
    public static int add(int a,int b,int ...c) {
		
		int ans=a+b;
		for(int i=0;i<c.length;i++) {
			
			ans+=c[i];
		}
		return ans;
	}
	public static float add(float a,float b) {
		return a+b;
	}
   public static void main(String[] args) {
	   System.out.println("Hello World!!!!");
	   System.out.println(add(10,20));
	   System.out.println(add(10,20,56));
	   System.out.println(add(10,20,56));
	   System.out.println(add(10,20,56,67,89,6,7,8));
	   System.out.println(add(10.6f,20.8f));
	   
   }
}
