package com.java8_features.smartcitytransportsystem;

@FunctionalInterface
public interface FareCalculator {
	double calculateFare(double distance);
}