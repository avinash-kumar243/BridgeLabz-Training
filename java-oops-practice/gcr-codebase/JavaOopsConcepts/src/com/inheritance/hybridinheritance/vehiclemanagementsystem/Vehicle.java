package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class Vehicle {
	protected int maxSpeed;
	protected String model;
	
	public Vehicle(int maxSpeed, String model) {
		this.maxSpeed = maxSpeed;
		this.model = model;
	}
	
	public void showDetails() {
		System.out.println("MaxSpeed: " + maxSpeed + " || model: " + model);
	}
}