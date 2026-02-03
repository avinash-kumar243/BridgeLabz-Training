package com.java8_features.smartcitytransportsystem;

import java.time.LocalTime;

public class MetroService implements TransportService {

	@Override
	public String getServiceName() {
		return "Metro";
	}

	@Override
	public String getRoute() {
		return "Central -> Airport";
	}

	@Override
	public double getFare() {
		return 50;
	}

	@Override
	public LocalTime getDepartureTime() {
		return LocalTime.of(6, 30);
	}

}