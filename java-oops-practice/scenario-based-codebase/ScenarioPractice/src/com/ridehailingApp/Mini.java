package com.ridehailingApp;

public class Mini extends Vehicle {
	private final double ratePerKm = 5;
	private final double baseFare = 60;
	private int distance;

	public Mini(int distance) {
		super("MINI101", 3, "Mini");
		this.distance = distance;
	}
	
	public double calculateFare() {
		return baseFare + distance * ratePerKm;
	}
	
	@Override
	protected void showDetails() {
		super.showDetails();
		System.out.println("Rate per km: " + ratePerKm);
		System.out.println("Base fare: " + baseFare + "\n");
	}
}