package com.encapsulation.ecommerceplateform;

public class Main {
	public static void main(String[] args) {
		Product electronics = new Electronics(101, "Watch", 12000);
		electronics.calculateDiscount(10);
		electronics.calculateTax(5);
		electronics.getTaxDetails();
		
		double discount = electronics.calculateDiscount(10);
		double finalPrice = electronics.finalPrice(discount);
		System.out.println("Discount: " + discount);
		System.out.println("Final price is : " + finalPrice);
	}
}