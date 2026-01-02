package com.inheritance.singleinheritance.smarthomedevices;

public class Thermostat extends Device {
	protected String temperatureSetting;

	public Thermostat(int deviceId, String status, String temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	
	public void displayStatus() {
		System.out.println("Temperature status is : " + temperatureSetting);
	}
}