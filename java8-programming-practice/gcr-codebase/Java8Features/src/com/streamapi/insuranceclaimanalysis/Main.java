package com.streamapi.insuranceclaimanalysis;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Claim> claims = List.of(new Claim("101", "Health Claim", 100000),
									 new Claim("102", "Vehicle Claim", 20000),
									 new Claim("103", "Life Claim", 10000000),
									 new Claim("104", "Property Claim", 5000000),
									 new Claim("105", "Health Claim", 2000000),
									 new Claim("106", "Life Claim", 6000000),
									 new Claim("107", "Property Claim", 8000000),
									 new Claim("108", "Life Claim", 4500000),
									 new Claim("109", "Health Claim", 1000000),
									 new Claim("110", "Property Claim", 222222224));
		
		
		Map<String, Double> averageClaimType = claims.stream()
			  .collect(Collectors.groupingBy(Claim :: getClaimType, Collectors.averagingDouble(Claim :: getAmount)));
		
		System.out.println("Average claim amount of each claim type is: \n");
		
		averageClaimType.forEach((type, avg) -> System.out.printf("%s -> %.2f\n", type, avg));
	}
}