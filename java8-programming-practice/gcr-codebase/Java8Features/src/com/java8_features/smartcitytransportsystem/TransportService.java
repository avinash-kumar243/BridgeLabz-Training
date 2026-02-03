package com.java8_features.smartcitytransportsystem;

import java.time.LocalTime;

public interface TransportService {
	
	// Abstract methods
	String getServiceName();
	String getRoute();
	double getFare();
	LocalTime getDepartureTime();
	 
	
	// default method
	default void printServiceDetails() {
		System.out.println("Service name: " + getServiceName() + " || Route: " + getRoute() + " || Fare: " + getFare());
	}
}