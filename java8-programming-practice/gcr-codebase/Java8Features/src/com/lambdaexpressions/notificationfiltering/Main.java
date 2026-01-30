package com.lambdaexpressions.notificationfiltering;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		
		// List of alerts
		List<Alert> alerts = Arrays.asList(new Alert("Heart problem detected", "Emergency"), 
										   new Alert("Take medicine at 9PM", "Medicine"),
										   new Alert("Pay hospital bill", "Bill"),
										   new Alert("Some important notice", "Notice"));
		
		
		// Rules :- which alert to show
		// User only wants Emergency and Medicine alerts
		Predicate<Alert> user = alert -> alert.getType().equalsIgnoreCase("Emergency")
							 		  || alert.getType().equalsIgnoreCase("Medicine");
		
		
		// Java Stream pipeline
		alerts.stream()
			  .filter(user)
			  .forEach(System.out::println); 
	}
}