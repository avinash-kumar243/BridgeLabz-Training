package com.java8_features.smartcitytransportsystem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SmartCityApp {
	public static void main(String[] args) {
		List<TransportService> services = Arrays.asList(new BusService(),
												  new MetroService(),
												  new TaxiService(),
												  new AmbulanceService());
		
		
		// filter service (Lambda) :-
		services.stream()
				.filter(s -> s.getFare() <= 50)
				.sorted(Comparator.comparing(TransportService::getDepartureTime))
				.forEach(TransportService::printServiceDetails);
		
		
		// Fare Calculator :-
		FareCalculator taxiFare = distance -> distance * 15;
		System.out.println("\nTaxi Fare for 10km: " + taxiFare.calculateFare(10) + "\n");
		
		
		// Trips
		Passenger p1 = new Passenger("Avi", "A -> B");
		Passenger p2 = new Passenger("Raj", "Central -> Airport");

		Trip t1 = new Trip(p1, new BusService(), 20, false);
		Trip t2 = new Trip(p2, new TaxiService(), 80, true);
		
		List<Trip> trips = Arrays.asList(t1, t2);
		
		
		// Dashboard :-
		DashboardService dashboard = new DashboardService();
		dashboard.showLiveServices(services);
		dashboard.revenueReport(trips);
		
		// Traffic handling
		TrafficManager manager = new TrafficManager();
		services.forEach(manager :: handleService);
	}
}