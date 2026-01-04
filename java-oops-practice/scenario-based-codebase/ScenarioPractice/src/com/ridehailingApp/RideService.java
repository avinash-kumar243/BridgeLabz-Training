package com.ridehailingApp;

public class RideService implements IRideService {
	private Driver d1;
	private Vehicle v1;
	
	public RideService(Driver d1, Vehicle v1) {
		this.d1 = d1;
		this.v1 = v1;
	}
	
	@Override
	public void bookRide(double distance) { 
		System.out.println("\nRide has been booked");
		System.out.println("\nAssigned Driver deatils : - ");
		d1.showDetails();
	}
	@Override
	public void endRide() {
		System.out.println("Total fare: " + v1.calculateFare());
		System.out.println("Ride end.");
	}
}