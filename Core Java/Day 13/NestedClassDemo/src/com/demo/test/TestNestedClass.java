package com.demo.test;

import com.demo.model.Book;
import com.demo.model.ParentClass;

public class TestNestedClass {

	public static void main(String[] args) {
		Book b=new Book(12,"testing");
		Book.Lesson l=b.new Lesson();
		l.method1();
		
		ParentClass p=new ParentClass();
		ParentClass.ChildClass ob=new ParentClass.ChildClass();
        ob.method2();
	}

}
