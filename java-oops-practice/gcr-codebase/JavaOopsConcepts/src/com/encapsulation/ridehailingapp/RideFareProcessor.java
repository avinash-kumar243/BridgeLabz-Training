package com.encapsulation.ridehailingapp;

public class RideFareProcessor {
    public static void calculateRideFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        vehicle.calculateFare(distance);
        System.out.println("\n");
    }
}