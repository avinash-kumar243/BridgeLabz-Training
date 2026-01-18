package com.generics.flightschedulingsystem;

import java.util.ArrayList;
import java.util.List;

public class FlightManager<T extends Number> {
	private List<Flight<T>> flights = new ArrayList<>();
	
	
	// Adding a flight to flights list
	public void addFlight(Flight<T> flight) {
		flights.add(flight);
	}
	
	
	// Display all flight details
	public void displayAllFlightDetails() {
		for(Flight<T> flight : flights) {
			flight.displayFlightDetails();
		}
	}
}