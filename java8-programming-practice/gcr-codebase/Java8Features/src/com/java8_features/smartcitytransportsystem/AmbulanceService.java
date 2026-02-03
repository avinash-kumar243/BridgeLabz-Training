package com.java8_features.smartcitytransportsystem;

import java.time.LocalTime;

public class AmbulanceService implements TransportService, EmergencyService {

	@Override
	public String getServiceName() {
		return "Ambulance";
	}

	@Override
	public String getRoute() {
		return "Emergency Route";
	}

	@Override
	public double getFare() {
		return 0.0;
	}

	@Override
	public LocalTime getDepartureTime() {
		return LocalTime.now();
	}
}