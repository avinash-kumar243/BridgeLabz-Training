package com.encapsulation.ecommerceplateform;

public abstract class Product implements Taxable {
	private int productId;
	private String name;
	protected double price;
	private double totalTax;
	
	public Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public double finalPrice(double discount) {
		return price + totalTax - discount;
	}
	
	@Override
	public void calculateTax(double tax) {
		totalTax = (getPrice() * tax) / 100;
	}

	@Override
	public void getTaxDetails() {
		System.out.println("Product: " + getName() + "\nPrice: " + price + "\n\nTotal tax: " + totalTax);
	}
	
	protected abstract double calculateDiscount(double discountPercentage);
}