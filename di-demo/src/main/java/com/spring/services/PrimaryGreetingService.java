package com.spring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en","default"})
public class PrimaryGreetingService implements GreetingServices {

	@Override
	public String sayGreeting() {
		
		return "Hello - Primary Greeting service! ";
	}

}
