package com.questions.functionalinterface.comparator.product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("A", 500),
				   new Product("B", 200),
				   new Product("C", 300),
				   new Product("D", 800),
				   new Product("E", 600));


		// Compare two products by price.
		products.stream()
				.sorted(Comparator.comparing(Product::getPrice))
				.forEach(System.out::println);
		
	}
}