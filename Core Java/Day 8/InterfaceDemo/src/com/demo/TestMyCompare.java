package com.demo;

public class TestMyCompare {

	public static void main(String[] args) {
		MyCompare ob=new MyCompare() {
			@Override
			public int compare(int x, int y) {
				return x>y?x:y;
			}
		};
		
		System.out.println("compare : "+ob.compare(10,23));
   
		MyCompare ob2=(x,y)->x>y?x:y;
		System.out.println("compare : "+ob2.compare(10,23));
		MyStringCompare<String, Integer> ob3=(x,y)->x.length()>y.length()?x.length():y.length();
	  System.out.println(ob3.compare("Hello","Welcome"));
	 
	  
	  MyStringCompare<Integer, Integer> ob4=(x,y)->x>y?x:y;
	  System.out.println(ob4.compare(12,45));
	  
	}

}
