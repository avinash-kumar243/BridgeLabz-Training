package com.streamapi.eventattendeemanager;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> attendees = List.of("Aman", "Adil", "Krishna", "Komal", "Priyanka", "Shekhar");
		
		System.out.println("--------------- Printing a welcome message for all attendees --------------");
		attendees.stream()
				 .forEach(name -> System.out.println("Welcome " + name));
	}
}