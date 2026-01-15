package com.trafficmanager;

// Vehicle Node Class
public class Vehicle {
	String vehicleNumber;
	Vehicle next;
	
	public Vehicle(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}
}