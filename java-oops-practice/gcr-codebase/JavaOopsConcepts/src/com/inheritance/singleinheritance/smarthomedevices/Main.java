package com.inheritance.singleinheritance.smarthomedevices;

public class Main {
	public static void main(String args[]) {
		Device device1 = new Device(101, "ON");
		System.out.println("Device id is: " + device1.deviceId);
		
		Thermostat device2 = new Thermostat(102, "OFF", "28C");
		System.out.println(device2.deviceId);
		System.out.println(device2.status);
		System.out.println(device2.temperatureSetting);
	} 
}