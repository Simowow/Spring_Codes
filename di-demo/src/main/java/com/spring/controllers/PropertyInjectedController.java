package com.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.services.GreetingServiceImpl;
import com.spring.services.GreetingServices;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingServices greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
