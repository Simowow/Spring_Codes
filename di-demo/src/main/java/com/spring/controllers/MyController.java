package com.spring.controllers;

import org.springframework.stereotype.Controller;

import com.spring.services.GreetingServices;

@Controller
public class MyController {
	
	private GreetingServices greetingServices;
	
	
	public MyController(GreetingServices greetingServices) {
		this.greetingServices = greetingServices;
	}


	public String hello() {
		System.out.println("Hello!!!");
		return greetingServices.sayGreeting();
	}

}
