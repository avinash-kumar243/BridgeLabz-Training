package com.generics.onlinemarketplace;

public class Product<T extends Category> {
	private String productName;
	private double price;
	private T category;
	
	public Product(String productName, double price, T category) {
		this.productName = productName;
		this.price = price;
		this.category = category; 
	}

	
	// Getters for Product data
	public String getProductName() {
		return productName;
	}
	public double getPrice() {  
		return price;
	}
	public T getCategory() {
		return category;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	public String getDetails() {
		return "Product name: " + productName + ", price: " + price + ", category: " + category; 
	}
}