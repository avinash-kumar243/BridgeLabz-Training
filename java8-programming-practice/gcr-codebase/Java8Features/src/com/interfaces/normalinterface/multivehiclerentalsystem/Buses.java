package com.interfaces.normalinterface.multivehiclerentalsystem;

public class Buses implements Rentable {

	@Override
	public void rent() {
		System.out.println("Bus rent");
	}

	@Override
	public void returnVehicle() {
		System.out.println("Bus returned\n");
	}
}