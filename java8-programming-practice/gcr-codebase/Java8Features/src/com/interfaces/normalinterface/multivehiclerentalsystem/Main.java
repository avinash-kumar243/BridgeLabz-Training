package com.interfaces.normalinterface.multivehiclerentalsystem;

public class Main {
	public static void main(String[] args) {
		 Rentable car = new Cars();
		 Rentable bike = new Bikes();
		 Rentable bus = new Buses();
		 
		 car.rent();
		 car.returnVehicle();
		 
		 bike.rent();
		 bike.returnVehicle();
		 
		 bus.rent();
		 bus.returnVehicle();
	}
}