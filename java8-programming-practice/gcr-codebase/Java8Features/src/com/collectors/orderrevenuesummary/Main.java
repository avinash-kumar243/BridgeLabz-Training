package com.collectors.orderrevenuesummary;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Order> orders = List.of(new Order("Avi", 100),
									 new Order("Deepak", 200),
									 new Order("Krishna", 450),
									 new Order("Anuj", 230),
									 new Order("Deepika", 560),
									 new Order("Shubham", 530),
									 new Order("Ravi", 800),
									 new Order("Tina", 640));	
		
		double totalAmount = orders.stream().collect(Collectors.summingDouble(Order::getAmount));
		
		System.out.println("Total amount: " + totalAmount);
	}
}