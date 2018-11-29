package com.spring.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.spring.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
	
	private SeterInjectedController seterInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.seterInjectedController = new SeterInjectedController();
		this.seterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.Hello , seterInjectedController.sayHello());
	}

}
