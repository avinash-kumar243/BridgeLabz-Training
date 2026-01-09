package com.foodorderingsystem;

// User details
public class User {
	private String name;
	private double valletAmount;
	
	public User(String name, int valletAmount) {
		this.name = name;
		this.valletAmount = valletAmount;
	}
	
	
	public String getName() {
		return name; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValletAmount() {
		return valletAmount;
	}
	public void setValletAmount(double valletAmount) {
		this.valletAmount = valletAmount;
	}
}