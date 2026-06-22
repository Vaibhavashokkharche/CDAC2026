package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;
import com.demo.beans.Product;

public class TestSpring {
	public static void main(String[] args) {

		// this line executed that time is called the default constructor those classes
		// added in beans
		ApplicationContext con = new ClassPathXmlApplicationContext("myspringconfig.xml");
		// this line is holding the object of my user in m by calling the get bean
		// meathod of application context
		// so these is an inversion of control object are created by spring its self by
		// refferring a data from mypringconfig.xml
		
		//there are two scope we can give the bean 1 singleton and 2 prototype bydefault is Singleton
		MyUser m = (MyUser) con.getBean("m1");
		System.out.println(m);
		Product p = (Product) con.getBean("p1");
		System.out.println(p);
		Product p2=(Product) con.getBean("p2");
		System.out.println(p2);
	
	}

}
