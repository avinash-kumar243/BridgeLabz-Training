package com.encapsulation.ecommerceplateform;

public class Clothing extends Product {

	private double totalTax;
	
	public Clothing(int productId, String name, int price) {
		super(productId, name, price);
	}

	@Override
	protected double calculateDiscount(double discountPercentage) {
		return (price * discountPercentage) / 100;
	}
}