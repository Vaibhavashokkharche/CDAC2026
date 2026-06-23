package com.demo;

public class StringFunctionsDemo {

	public static void main(String[] args) {
		String s1="this is test";
		//length of the string
		System.out.println("Length "+s1.length());
		//find substring from 2 to 5 index position character
		System.out.println("substr "+s1.substring(2,6));
		//find substring starting from 2 till end
		System.out.println("substr "+s1.substring(2));
		//to find one charcter at the given position
		System.out.println("charAt "+s1.charAt(2));
		//convert to lowercase
		System.out.println("lowercase "+s1.toLowerCase());
		System.out.println("uppercase "+s1.toUpperCase());
		System.out.println("split "+s1.split(" ").length);
		System.out.println("join "+String.join(":",s1, "xxxxx","yyyy"));
		System.out.println("equals "+s1.equals("hello"));
		System.out.println("compareTo "+s1.compareTo("zxy"));
		

	}

}
