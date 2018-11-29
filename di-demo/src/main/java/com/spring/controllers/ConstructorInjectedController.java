package com.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.services.GreetingServices;

@Controller
public class ConstructorInjectedController {
	
	private GreetingServices greetingServices;
	
	// It's not mandatory to mark a constructor as @Autowired for constructor DI but it's still a good practice to mark it as @Autowired 
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingServices greetingServices) {
		
		this.greetingServices = greetingServices;
	}
	
	public String sayHello() {
		return greetingServices.sayGreeting();
	}
	
	

}
