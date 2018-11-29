package com.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.services.*;

@Controller
public class SeterInjectedController {
	
	private GreetingServices greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	@Autowired
	@Qualifier("getterGreetingService")
	public void setGreetingService(GreetingServices greetingService) {
		this.greetingService = greetingService;
	}
	
	

}
