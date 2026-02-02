package com.questions.functionalinterface.predicate.ecommerce;

import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Order a1 = new Order("101", 12000);
		Order a2 = new Order("102", 8000);

		
		// Free delivery available above 10000.
		Predicate<Order> p = order -> order.getAmount() > 10000;
		
		System.out.println("Amount: " + a1.getAmount() + " -> Is free delivery -> " + p.test(a1));
		System.out.println("Amount: " + a2.getAmount() + " -> Is free delivery -> " + p.test(a2));

	}
}