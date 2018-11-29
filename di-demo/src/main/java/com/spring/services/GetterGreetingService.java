package com.spring.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingServices {

	@Override
	public String sayGreeting() {
		return "Hello - I was injected by the getter!!!";
	}

}
