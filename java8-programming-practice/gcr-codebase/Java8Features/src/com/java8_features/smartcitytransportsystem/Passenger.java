package com.java8_features.smartcitytransportsystem;

public class Passenger {
	private String name;
	private String route;
	
	public Passenger(String name, String route) {
		this.name = name;
		this.route = route;
	}
	public String getRoute() {
		return route;
	}
}