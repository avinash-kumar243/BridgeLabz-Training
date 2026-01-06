package com.groceryshoppingapp;

public class Main {
	public static void main(String[] args) {
		Product milk = new PerishableProduct("milk", 40, "Dairy");
		Product rice = new NonPerishableProduct("rice", 60, "Grains");
		
		Cart cart = new Cart();
		
		cart.addProduct(milk, 2);
		cart.addProduct(rice, 5);
		
		System.out.println("Total price is : " + cart.getTotalPrice());
		
		cart.applyDiscount(20);
		
		System.out.println(cart.getTotalPrice());
	}
}