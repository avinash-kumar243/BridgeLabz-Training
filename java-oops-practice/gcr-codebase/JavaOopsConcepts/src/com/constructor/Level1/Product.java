package com.constructor.Level1;

public class Product {
	private String productName;
	private int price;
	static int totalProducts;
	
	// Parameterized Constructor
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	
	// Instance method
	public void displayProductDetails() {
		totalProducts++;
		System.out.println("\nProduct Name is : " + productName);
		System.out.println("Product Price is : " + price);
	}
	
	// Class method
	public static void displayTotalProducts() {
		System.out.println("\nTotal products is : " + totalProducts);
	}
}