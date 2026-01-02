package com.inheritance.multilevelinheritance.retailordermanagement;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Order order = new Order("ORD01", LocalDate.of(2026, 1, 2));
		ShippedOrder shipped = new ShippedOrder("ORD02", LocalDate.of(2026, 1, 5), "TRK501");
		DeliveredOrder delivered = new DeliveredOrder("ORD03", LocalDate.of(2026, 1, 8), "TRK502", LocalDate.of(2026, 1, 10));
		
		System.out.println("\n------ Order ------");
		order.showDetails();
		
		System.out.println("\n------- Shipped Order -------");
		shipped.showDetails();
		
		System.out.println("\n------- Delivered Order -------");
		delivered.showDetails();
	}
}