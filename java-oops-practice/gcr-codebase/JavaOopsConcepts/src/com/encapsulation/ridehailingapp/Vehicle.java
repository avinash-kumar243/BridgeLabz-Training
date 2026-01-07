package com.encapsulation.ridehailingapp;

public abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String driverContact;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
    public void setDriverContact(String driverContact) {
        this.driverContact = driverContact;
    }
    public String getDriverContact() {
        return driverContact;
    }
    
    
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per KM: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}