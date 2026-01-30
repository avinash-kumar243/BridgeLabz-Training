package com.interfaces.normalinterface.smartdevicecontrol;

public class TV implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("TV on");
	}

	@Override
	public void turnOff() {
		System.out.println("TV off\n");
	}
}