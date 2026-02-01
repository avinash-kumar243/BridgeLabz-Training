package com.questions.lambdaexpression.shopping;

public class Product {
	private int id;
	private String name;
	private double price;
	private int deliveryCharge;
	private int quantity;
	
	public Product(int id, String name, double price, int deliveryCharge, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.deliveryCharge = deliveryCharge;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int isDeliveryCharge() {
		return deliveryCharge;
	}
	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Product [id: " + id + ", name: " + name + ", price: " + price + ", delivery charge: " + deliveryCharge
				+ ", quantity: " + quantity + "]";
	}
	
	
}