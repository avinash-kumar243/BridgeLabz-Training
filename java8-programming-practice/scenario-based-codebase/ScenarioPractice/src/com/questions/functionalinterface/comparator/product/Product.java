package com.questions.functionalinterface.comparator.product;

public class Product {
	private String id;
	private int price;
	
	public Product(String id, int price) {
		this.id = id;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Product [id: " + id + " || price: " + price + "]";
	}
}