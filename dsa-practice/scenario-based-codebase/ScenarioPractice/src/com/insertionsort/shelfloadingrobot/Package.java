package com.insertionsort.shelfloadingrobot;

public class Package {
	private String packageId;
	private double packageWeight;
	
	public Package(String packageId, double packageWeight) {
		this.packageId = packageId;
		this.packageWeight = packageWeight;
	}

	// Getters and Setters for packages
	public String getPackageId() {
		return packageId;
	}
	public double getPakcageWeight() {
		return packageWeight;
	}
	public void setPackageWeight(double packageWeight) {
		this.packageWeight = packageWeight;
	}

	@Override
	public String toString() {
		return "Package id: " + packageId + " || " + packageWeight; 
	}
}