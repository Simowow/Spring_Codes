package com.spring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingService implements GreetingServices {

	@Override
	public String sayGreeting() {
		
		return "Servicio de Saludo Primario";
	}

}
