package com.lambdaexpressions.invoiceobjectcreation;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		// List of transactions id
		List<String> transactionsList = Arrays.asList("TID101", "TID102", "TID103");
		
		// Invoice::new  :-  Constructor reference
		List<Invoice> invoiceList = transactionsList.stream().map(Invoice::new).toList();
		
		// Printing each invoice object
		invoiceList.forEach(System.out::println);
	}
}