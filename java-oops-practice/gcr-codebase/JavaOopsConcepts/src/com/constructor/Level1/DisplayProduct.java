package com.constructor.Level1;

public class DisplayProduct {
	public static void main(String[] args) {
		Product product1 = new Product("Milk", 50);
		Product product2 = new Product("Curd", 120);
		Product product3 = new Product("Ghee", 600);
		
		// Instance methods are called through objects
		product1.displayProductDetails();
		product2.displayProductDetails();
		product3.displayProductDetails();
		
		// Class method is called through Class
		Product.displayTotalProducts();
	}
}