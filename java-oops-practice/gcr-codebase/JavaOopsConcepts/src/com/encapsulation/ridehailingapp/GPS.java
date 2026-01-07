package com.encapsulation.ridehailingapp;

public interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}