package com.groceryshoppingapp;

public class NonPerishableProduct extends Product {

	public NonPerishableProduct(String name, double price, String catagory) {
		super(name, price, catagory);
	}
	
	public double getDiscountRate() {
		return 0.1;
	}
} 