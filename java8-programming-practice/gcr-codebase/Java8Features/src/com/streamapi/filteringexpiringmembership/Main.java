package com.streamapi.filteringexpiringmembership;

import java.time.LocalDate;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Member> members = List.of(new Member("101", LocalDate.now().plusDays(20)),
									   new Member("102", LocalDate.now().plusDays(40)),
									   new Member("103", LocalDate.now().plusDays(80)),
									   new Member("104", LocalDate.now().plusDays(12)),
									   new Member("105", LocalDate.now().plusDays(45)),
									   new Member("106", LocalDate.now().plusDays(22)),
									   new Member("107", LocalDate.now().plusDays(30)));
		
		System.out.println("All members whose membership will be expired in next 30 days are: \n");
		System.out.println("Today date: " + LocalDate.now());
		
		members.stream()
								  .filter(member -> {
										  LocalDate today = LocalDate.now();
										  LocalDate next30Days = LocalDate.now().plusDays(30);
										  
										  return !member.getExpiry().isBefore(today) && 
												 !member.getExpiry().isAfter(next30Days);
								  }).forEach(System.out::println);
	}
}