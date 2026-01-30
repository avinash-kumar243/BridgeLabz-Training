package com.interfaces.normalinterface.smartdevicecontrol;

public class Lights implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Lights on");
	}

	@Override
	public void turnOff() {
		System.out.println("Lights off\n");
	}
}