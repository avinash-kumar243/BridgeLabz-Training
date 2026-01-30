package com.interfaces.normalinterface.smartdevicecontrol;

public class AC implements SmartDevice {
	
	@Override
	public void turnOn() {
		System.out.println("AC on");
	}

	@Override
	public void turnOff() {
		System.out.println("AC off\n");
	}
}