package com.interfaces.normalinterface.smartdevicecontrol;

public class Main {
	public static void main(String[] args) {
		SmartDevice ac = new AC();
		ac.turnOn();
		ac.turnOff();
		
		SmartDevice tv = new TV();
		tv.turnOn();
		tv.turnOff();
		
		SmartDevice lights = new Lights();
		lights.turnOn();
		lights.turnOff();
	}
}