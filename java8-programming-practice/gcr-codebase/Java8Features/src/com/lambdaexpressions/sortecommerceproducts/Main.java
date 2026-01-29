package com.lambdaexpressions.sortecommerceproducts;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(101, 4.5, 50000, 10));
		products.add(new Product(102, 4.2, 15000, 8));
		products.add(new Product(103, 4.7, 25000, 12));
		products.add(new Product(104, 4.6, 35000, 18));
		products.add(new Product(105, 4.8, 40000, 20));
		
		
		// Comparing and sorting Products by price
		products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice())); 
		System.out.println("\nProducts are sorted by price: ");
		products.forEach(System.out::println);
		
		
		// Comparing and sorting Products by rating
		products.sort((p1, p2) -> Double.compare(p1.getRating(), p2.getRating()));
		System.out.println("\nProducts are sorted by rating");
		products.forEach(System.out::println);
		
		// Comparing and sorting Products by discount
		products.sort((p1, p2) -> Double.compare(p1.getDiscount(), p2.getDiscount()));
		System.out.println("\nProducts are sorted by disount");
		products.forEach(System.out::println);

	}
}