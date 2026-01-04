package com.ridehailingApp;

public class Driver {
	protected String name;
	protected String licenseNumber;
	protected double rating;
	
	public Driver(String name, String licenseNumber, double rating) {
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	}
	
	public void showDetails() {	
		System.out.println("Driver name: " + name + " || license number: " + licenseNumber + " || rating: " + rating + "\n");
	}
}