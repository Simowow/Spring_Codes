package com.spring.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingServices {
	
	public static final String Hello = "Hello Gurus!!! - Original (Property)";
	@Override
	public String sayGreeting() {
		
		return Hello;
	}

}
