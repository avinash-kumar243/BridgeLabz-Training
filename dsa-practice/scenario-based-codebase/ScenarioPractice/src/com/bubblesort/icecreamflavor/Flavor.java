package com.bubblesort.icecreamflavor;

public class Flavor {
	private String flavorName;
	private int sold;
		
	public Flavor(String flavorName, int sold) {
		this.flavorName = flavorName;
		this.sold = sold;
	}

	// Getters for flavors
	public String getFlavorName() {
		return flavorName;
	}
	public int getQuantitySold() {
		return sold;
	}
}