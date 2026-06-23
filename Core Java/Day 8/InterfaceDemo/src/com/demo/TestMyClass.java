package com.demo;

public class TestMyClass {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		ob.m3();
		ob.mymethod1();
		MyInterface mint=new MyClass();
		((MyClass) mint).mymethod1();
		//old style-----annonymous class
		MtFunctionInterface mob1=new MtFunctionInterface(){
			@Override
			public void method1() {
				System.out.println("in annonymous class method1");	
			}
		};
		mob1.method1();
		
		
		MtFunctionInterface mob2=() ->{
				System.out.println("in annonymous class method1 using arrow function");
				
			};
			mob2.method1();
			
	
		mob1.method1();
		
		

	}

}
