package com.insertionsort.tailorshop;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	// Sorting Orders - Insertion Sort 
	public static void sortOrders(List<Order> orders) {
		int n = orders.size();
		
		for(int i=1; i<n; i++) {
			Order order = orders.get(i);
			
			int j = i-1;
			while(j >= 0 && orders.get(j).getDeliveryDeadline().isAfter(order.getDeliveryDeadline())) {
				orders.set(j+1, orders.get(j));
				j--;
			}
			
			j++;
			orders.set(j, order);
		}
	}
	
	
	// Display order details
	public static void display(List<Order> orders) {
		if(orders.size() == 0) {
			System.out.println("No order present");
			return;
		}
		
		for(Order order : orders) {
			System.out.println(order);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------- TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort) ---------------");
		
		
		List<Order> orders = new ArrayList<>(Arrays.asList(new Order("101", LocalTime.parse("18:00")), new Order("102", LocalTime.parse("12:00")), new Order("103", LocalTime.parse("11:30")), new Order("104", LocalTime.parse("20:00")), new Order("105", LocalTime.parse("22:30"))));
		
		
		
		System.out.println("\nBefore sorting, orders details are : - \n");
		display(orders);
		
		sortOrders(orders);
		
		System.out.println("\nAfter sorting of delivery deadlines, orders details are : - \n");
		display(orders);
	}
}