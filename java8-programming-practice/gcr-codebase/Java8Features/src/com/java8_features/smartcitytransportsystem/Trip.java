package com.java8_features.smartcitytransportsystem;

public class Trip {
	private Passenger passenger;
	private TransportService service;
	private double fare;
	private boolean peakTime;
	
	public Trip(Passenger passenger, TransportService service, double fare, boolean peakTime) {
		this.passenger = passenger;
		this.service = service;
		this.fare = fare;
		this.peakTime = peakTime;
	}

	
	public Passenger getPassenger() {
		return passenger;
	}
	public TransportService getService() {
		return service;
	}
	public double getFare() {
		return fare;
	}
	public boolean isPeakTime() {
		return peakTime;
	}
	public String gerRoute() {
		return service.getRoute(); 
	}
}