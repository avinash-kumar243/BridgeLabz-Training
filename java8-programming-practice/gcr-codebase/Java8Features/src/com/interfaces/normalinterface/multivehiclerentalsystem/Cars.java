package com.interfaces.normalinterface.multivehiclerentalsystem;

public class Cars implements Rentable {

	@Override
	public void rent() {
		System.out.println("Car rent");
	}

	@Override
	public void returnVehicle() {
		System.out.println("Car returned\n");
	}
}