package com.encapsulation.ecommerceplateform;

public class Electronics extends Product {

	public Electronics(int productId, String name, int price) {
		super(productId, name, price);
	}

	@Override
	protected double calculateDiscount(double discountPercentage) {
		return (price * discountPercentage) / 100;
	}
}