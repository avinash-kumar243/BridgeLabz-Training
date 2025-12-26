package com.classandobject.Level1;

public class AreaOfCircle {
	double radius;
	
	// Constructor
	public AreaOfCircle(double radius) {
		this.radius = radius;
	}
	
	// compute and display area of circle
	public void areaOfCircle() {
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle is : " + area);
	}
	
	// compute and display circumference of circle
	public void circumferenceOfCircle() {
		double circumference = 2 * 3.14 * radius;
		System.out.println("Circumference of circle is : " + circumference);
	}
}