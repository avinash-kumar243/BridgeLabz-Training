package com.groceryshoppingapp;

public class PerishableProduct extends Product {

	public PerishableProduct(String name, double price, String catagory) {
		super(name, price, catagory);
	}

	@Override
	public double getDiscountRate() {
		return 0.15;
	}
}