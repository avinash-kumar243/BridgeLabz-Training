package com.encapsulation.ridehailingapp;

public class RideAppMain {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", "Ramesh", 15.0);
        Vehicle v2 = new Bike("B202", "Amit", 10.0);
        Vehicle v3 = new Auto("A303", "Suresh", 12.0);

        RideFareProcessor.calculateRideFare(v1, 12.5);
        RideFareProcessor.calculateRideFare(v2, 8.0);
        RideFareProcessor.calculateRideFare(v3, 6.2);

        GPS gps1 = (GPS) v1;
        gps1.updateLocation("Downtown");
        System.out.println("Car Current Location: " + gps1.getCurrentLocation());
    }
}