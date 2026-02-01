package com.questions.lambdaexpression.shopping;

import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Product> products = List.of(new Product(101, "Shirt", 400, 40, 2),
										 new Product(102, "Pant", 300, 30, 4),
										 new Product(103, "Shoes", 800, 50, 1),
										 new Product(104, "Glasses", 150, 40, 2),
										 new Product(105, "Oil", 100, 10, 3),
										 new Product(106, "Phone", 8000, 100, 1),
										 new Product(107, "Watch", 300, 40, 3));
		
		
		
		// 1. Use lambda to apply 10% discount on product price.
		System.out.println("\n1. ------------------- Apply 10% discount on product price -------------------");
		products.stream()
				.forEach(product -> System.out.println("After 10% discount, final price of product: " + product.getName() + " is -> " + (product.getPrice() * 0.90)));
		
		
		// 2. Sort products by price using lambda.
		System.out.println("\n2. --------------- Sort products by price --------------------");
		products.stream()
				.sorted(Comparator.comparing(Product::getPrice))
				.forEach(System.out::println);
		
		
		// 3. Use lambda to check free delivery eligibility (amount > 500).
		System.out.println("\n3. ----------------- Check free delivery eligibility (amount > 500) --------------------");
		products.stream()
				.filter(product -> product.getPrice() > 500)
				.forEach(System.out::println);
		
		
		// 4. Use lambda to calculate final bill amount.
		System.out.println("\n4. ----------------- Calculate final bill amount -----------------");
		products.stream()
				.forEach(product -> {
					double bill = product.getPrice() * product.getQuantity() * 0.90;
					if(product.getPrice() <= 500) bill += product.isDeliveryCharge();
					System.out.println("Final bill of product " + product.getName() + " : " + bill);
				});
		
		
		// 5. Use lambda to print product names.
		System.out.println("\n5. ------------------ Printing product names -------------------");
		products.forEach(product -> System.out.println(product.getName()));
		
	}
}