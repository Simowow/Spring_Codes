package com.spring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"de","default"})
public class PrimaryGermanGreetingService implements GreetingServices {

	@Override
	public String sayGreeting() {
		
		return "Primarer GruBdienst!";
	}

}
