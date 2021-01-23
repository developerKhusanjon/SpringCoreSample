package com.tuychiboev.SpringSample;

import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle {
	
	public void drive() {
		System.out.println("Effortable");
	}

}
