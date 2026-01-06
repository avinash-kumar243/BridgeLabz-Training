package com.encapsulation.ecommerceplateform;

public class Groceries extends Product {
	
	public Groceries(int productId, String name, double price) {
		super(productId, name, price);
		
	}

	@Override
	protected double calculateDiscount(double discountPercentage) {
		return (price * discountPercentage) / 100;
	}
}