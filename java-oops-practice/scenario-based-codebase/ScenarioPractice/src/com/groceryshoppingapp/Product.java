package com.groceryshoppingapp;

public abstract class Product {
	private String name;
	private double price;
	private String catagory;
	
	protected Product(String name, double price, String catagory) {
		this.name = name;
		this.price = price; 
		this.catagory = catagory;
	}
	
	public double getPrice() {
		return this.price;
	} 
	public String getName() {
		return this.name;
	}
	public String getCatagory() {
		return this.catagory;
	}
	
	public abstract double getDiscountRate();
}