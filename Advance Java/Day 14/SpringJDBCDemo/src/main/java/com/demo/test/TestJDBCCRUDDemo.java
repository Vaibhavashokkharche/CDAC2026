package com.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import com.demo.service.ProductService;

public class TestJDBCCRUDDemo {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("myspringconfig.xml");
		ProductService pservice=(ProductService) ctx.getBean("productServiceImpl");

	}

}
