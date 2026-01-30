package com.interfaces.staticmethods.dateformatutility;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		LocalDate invoiceDate = LocalDate.now();
		
		System.out.println("Invoice Date (dd-MM-yyyy): " + DateFormatter.formatDate(invoiceDate, "dd-MM-yyyy"));
		
		System.out.println("Invoice Date(dd MMM yyyy): " + DateFormatter.formatDate(invoiceDate, "dd MMM yyyy"));
		
		System.out.println("Invoice Date(yyyy-MM-dd): " + DateFormatter.formatDate(invoiceDate, "yyyy-MM-dd"));
	}
} 