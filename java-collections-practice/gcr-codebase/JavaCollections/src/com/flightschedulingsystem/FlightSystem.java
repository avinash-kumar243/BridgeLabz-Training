package com.flightschedulingsystem;

public class FlightSystem {
	public static void main(String[] args) {
		Flight<Integer> flight1 = new Flight<>(101, "Mumbai", "Delhi");
		Flight<String> flight2 = new Flight<>("ABC102", "Kolkata", "Bhopal");
		
		Booking<Integer> booking1 = new Booking<>(5001, "Avinash", flight1);
		Booking<String> booking2 = new Booking<>("ABC5002", "Deepanshu", flight2);
		
		
		booking1.displayBookingDetails();
		System.out.println("--------------------------------------");
		booking2.displayBookingDetails();
		
		System.out.println("\n--------- Flight Management ----------");
		
		FlightManager<Integer> manager = new FlightManager<>();
		
		manager.addFlight(flight1);
		manager.displayAllFlightDetails();
	}
}