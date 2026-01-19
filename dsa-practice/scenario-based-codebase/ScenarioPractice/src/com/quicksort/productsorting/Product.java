package com.quicksort.productsorting;

public class Product {
	private String productId;
	private double discountPercentage;
	
	public Product(String productId, double discountPercentage) {
		this.productId = productId;
		this.discountPercentage = discountPercentage;
	}

	
	// Getters and Setters for product details
	public String getProductId() {
		return productId;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
}