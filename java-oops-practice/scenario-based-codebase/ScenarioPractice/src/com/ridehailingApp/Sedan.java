package com.ridehailingApp;

public class Sedan extends Vehicle {
	private final double ratePerKm = 20;
	private final double baseFare = 100;
	private int distance;

	public Sedan(int distance) {
		super("Sedan103", 7, "Sedan");
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