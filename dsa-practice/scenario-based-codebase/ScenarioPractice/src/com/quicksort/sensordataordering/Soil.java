package com.quicksort.sensordataordering;

import java.time.LocalTime;

public class Soil {
	private double temperature;
	private LocalTime time;

	public Soil(double temperature, LocalTime time) {
		this.temperature = temperature;
		this.time = time;
	}

	
	// Getters for Soil temperature and time
	public double getTemperature() {
		return temperature;
	}
	public LocalTime getTime() {
		return time;
	}
	 
	
	@Override
	public String toString() {
		return "Soil temperature: " + temperature + " at time: " + time;
	}
}