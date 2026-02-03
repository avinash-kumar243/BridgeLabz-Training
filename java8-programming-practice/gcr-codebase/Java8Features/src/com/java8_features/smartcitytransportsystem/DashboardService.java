package com.java8_features.smartcitytransportsystem;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DashboardService {
	void showLiveServices(List<TransportService> services) {
		services.forEach(TransportService::printServiceDetails);
	}
	
	void revenueReport(List<Trip> trips) {
		double totalRevenue = trips.stream()
							.collect(Collectors.summarizingDouble(Trip::getFare))
							.getSum(); 
		
		System.out.println("\nTotal revenue: " + totalRevenue + "\n");
		
		
		Map<Boolean, List<Trip>> peakSplit = trips.stream()
												  .collect(Collectors.partitioningBy(Trip::isPeakTime));
		
		
		System.out.println("\nPeak Trips: " + peakSplit.get(true).size());
		System.out.println("Non-Peak Trips: " + peakSplit.get(false).size() + "\n");
	}
}