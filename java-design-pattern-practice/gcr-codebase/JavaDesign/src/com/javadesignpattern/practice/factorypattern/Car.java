package com.javadesignpattern.practice.factorypattern;

public class Car implements Vehicle {
	
	@Override
	public void drive() {
		System.out.println("Car is driving");
	}
}