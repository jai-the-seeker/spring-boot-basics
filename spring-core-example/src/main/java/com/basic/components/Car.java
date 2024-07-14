package com.basic.components;

import org.springframework.stereotype.Component;

@Component
public class Car {

	private Wheel wheel;
	
	public Car (Wheel wheel) {
		this.wheel = wheel;
	}
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Car is driving");
		wheel.use();
	}

}
