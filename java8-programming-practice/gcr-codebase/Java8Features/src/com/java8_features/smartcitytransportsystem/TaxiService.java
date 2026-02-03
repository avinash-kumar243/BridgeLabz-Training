package com.java8_features.smartcitytransportsystem;

import java.time.LocalTime;

public class TaxiService implements TransportService {

	@Override
	public String getServiceName() {
		return "Taxi";
	}

	@Override
	public String getRoute() {
		return "Home -> Office";
	}

	@Override
	public double getFare() {
		return 80;
	}

	@Override
	public LocalTime getDepartureTime() {
		return LocalTime.of(12, 30); 
	}
}