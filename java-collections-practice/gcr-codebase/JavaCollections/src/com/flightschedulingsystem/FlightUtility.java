package com.flightschedulingsystem;

import java.util.List;

public class FlightUtility {
	public static void displayFlightDetails(List<? extends Flight<?>> flights) {
		for(Flight<?> flight : flights) {
			flight.displayFlightDetails();
		}
	}
}