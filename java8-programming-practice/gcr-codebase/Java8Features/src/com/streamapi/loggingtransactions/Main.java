package com.streamapi.loggingtransactions;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> transactionIds = List.of(101, 102, 103, 104, 105);
		
		// Logging a list of transaction IDs with TimeStamps
		System.out.println("------------------- Logging a list of transaction IDs with TimeStamps -------------------");
		transactionIds.stream().forEach(transactionId -> System.out.println(LocalDateTime.now() + " - Transaction: " + transactionId));
	}
}