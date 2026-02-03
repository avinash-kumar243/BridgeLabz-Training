package com.java8_features.smartcitytransportsystem;

public class TrafficManager {
	public void handleService(TransportService service) {
		if(service instanceof EmergencyService) {
			System.out.println("Emergency service -> Traffic bypass allowed");
		} else {
			System.out.println("Normal service -> Follow traffic rules");
		}
	}
}