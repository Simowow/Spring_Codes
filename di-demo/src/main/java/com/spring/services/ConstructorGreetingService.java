package com.spring.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingServices {
	@Override
	public String sayGreeting() {
		return "Hello - I was injected via constructor!!!";
	}
}
