package com.java8_features.smartcitytransportsystem;

import java.time.LocalTime;

public class BusService implements TransportService {
	
	@Override
	public String getServiceName() {
		return "City Bus";
	}
	
	@Override
	public String getRoute() {
		return "A -> B";
	}
	
	@Override
	public double getFare() {
		return 100;
	}
	
	@Override
	public LocalTime getDepartureTime() {
		return LocalTime.of(8, 30); 
	}
}