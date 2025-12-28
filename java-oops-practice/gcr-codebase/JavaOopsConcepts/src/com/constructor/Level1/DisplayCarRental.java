package com.constructor.Level1;

public class DisplayCarRental {
	private String customerName;
	private String carModel;
	private int rentalDays;
	private int costPerDay;
	
	// Parameterized Constructor
	public DisplayCarRental(String customerName, String carModel, int rentalDays, int costPerDay) {
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		this.costPerDay = costPerDay;
	}
	
	// Calculate total cost
	public int totalCost() {
		int totalCost = costPerDay * rentalDays;
		return totalCost;
	}
	
	// Show all the car rent details
	public void showDetails() {
		System.out.println("Customer name is : " + customerName);
		System.out.println("Car model is : " + carModel);
		System.out.println("Rental days is : " + rentalDays);
		System.out.println("Per day cost is : " + costPerDay);
		System.out.println("Total rent is : " + totalCost());
	}
}