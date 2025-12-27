package com.constructor.Level1;

public class DisplayCircle {
	private double radius;
	
	// Default Constructor
	public DisplayCircle() {
		this.radius = 5;
	}
	
	// Parameterized Constructor
	public DisplayCircle(double radius) {
		this.radius = radius;
	}
	
	// display radius and area of circle
	public void displayCircle() {
		System.out.print("\nRadius of Circle is : " + radius);
		System.out.print(" and Area of Circle is : " + (3.14 * Math.pow(radius, 2)));
	}
}