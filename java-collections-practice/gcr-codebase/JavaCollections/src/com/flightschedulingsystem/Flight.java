package com.flightschedulingsystem;

public class Flight<T> {
	private T flightNumber;
	private String departure;
	private String destination;
	
	public Flight(T flightNumber, String departure, String destination) {
		this.flightNumber = flightNumber;
		this.departure = departure;
		this.destination = destination;
	}
	
	
	// Getters for flightNumber
	public T getFlightNumber() {
		return flightNumber; 
	}
	
	
	// Display flight details
	public void displayFlightDetails() {
		System.out.println("Flight number: " + flightNumber + " || From: " + departure + " || To: " + destination);
	}
}