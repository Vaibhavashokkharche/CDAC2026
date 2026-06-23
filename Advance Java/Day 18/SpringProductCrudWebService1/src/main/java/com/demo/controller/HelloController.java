package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/") 
	public String sayHello() {
		return "Hello from webService";
	}
	
	@GetMapping("/test") 
	public String greet() {
		return "Welcome to Spring  webService";
	}
	  
}
