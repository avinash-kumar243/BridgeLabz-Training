package com.mergersort.stallsorting;

public class Stall {
	private String stallName;
	private int customerCount;
	
	
	public Stall(String stallName, int customerCount) {
		this.stallName = stallName;
		this.customerCount = customerCount;
	}

	
	// Getters for stall details
	public String getStallName() {
		return stallName;
	}
	public int getCustomerCount() {
		return customerCount;
	}
	
	
	@Override
	public String toString() {
		return "Zone name: " + stallName + ", customer count: " + customerCount; 
	}
}