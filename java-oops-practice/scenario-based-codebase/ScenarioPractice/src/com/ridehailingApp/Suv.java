package com.ridehailingApp;

public class Suv extends Vehicle {
	private final double ratePerKm = 10;
	private final double baseFare = 80;
	private int distance;

	public Suv(int distance) {
		super("SUV102", 5, "Suv");
		this.distance = distance;
	}
	
	@Override
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