package com.streamapi.transformingnames;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Customer> customers = List.of(new Customer(1, "Avi"),
										   new Customer(2, "Allu"),
										   new Customer(3, "Aman"),
										   new Customer(4, "Deepak"),
										   new Customer(5, "Rani"),
										   new Customer(6, "Devika"),
										   new Customer(7, "Gautam"),
										   new Customer(8, "Sonali"));
		
		System.out.println("All customers names in uppercase are :- ");
		customers.stream()
				 .map(customer -> customer.getName().toUpperCase())
				 .sorted()
				 .forEach(System.out::println);
	}
}