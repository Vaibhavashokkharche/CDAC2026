package com.demo;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=s1;
		System.out.println("s1==s2"+(s1==s2));
		String s3="Hello";
		System.out.println("s3==s2"+(s3==s2));
		String s4=new String("Hello");
		System.out.println("s4==s2"+(s4==s2));
		System.out.println("s4.equals(s2)"+(s4.equals(s2)));
		s1="Welcome";
		System.out.println(s1+"   "+s2);
		System.out.println("s1==s2"+(s1==s2));
		StringBuilder sbld=new StringBuilder("xxxxx");
		StringBuffer sbuff=new StringBuffer("xxxxx");
		sbuff.append("yyyyy");
		System.out.println(sbuff);
	};

}
