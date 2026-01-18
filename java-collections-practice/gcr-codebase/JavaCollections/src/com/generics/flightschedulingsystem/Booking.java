package com.generics.flightschedulingsystem;

public class Booking<T> {
	private T bookingId;
	private String passengerName;
	private Flight<?> flight;
	
	public Booking(T bookingId, String passengerName, Flight<?> flight) {
		this.bookingId = bookingId;
		this.passengerName = passengerName;
		this.flight = flight;
	}
	
	
	// Display booking details
	public void displayBookingDetails() {
		System.out.println("Booking id: " + bookingId);
		System.out.println("Passenger name: " + passengerName);
		flight.displayFlightDetails();
	}
}