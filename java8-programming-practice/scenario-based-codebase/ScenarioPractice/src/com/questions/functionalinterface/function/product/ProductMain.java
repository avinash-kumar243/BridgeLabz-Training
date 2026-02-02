package com.questions.functionalinterface.function.product;

import java.util.function.Function;

public class ProductMain {
	public static void main(String[] args) {
		
		// Convert product price into discounted price.
		Function<Integer, Double> f = price -> price * 0.90;
		
		System.out.println("----------- Applying 10% discount on product -------------");
		System.out.println("Product price is: 1000, discounted price is: " + f.apply(1000));
	}
}