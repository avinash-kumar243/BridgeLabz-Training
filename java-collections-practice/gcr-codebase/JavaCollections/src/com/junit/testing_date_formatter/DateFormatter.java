package com.junit.testing_date_formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
	
	private static final DateTimeFormatter inputDateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	private static final DateTimeFormatter outputDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
	public String formatDate(String inputDate) {
		if(inputDate == null || inputDate.trim().isEmpty()) {
			throw new IllegalArgumentException("Input date can not be null or empty");
		}
		
		try {
			LocalDate inputdate = LocalDate.parse(inputDate, inputDateFormat);
		
			String outputdate = inputdate.format(outputDateFormat);
			return outputdate; 
		} catch(IllegalArgumentException e) {
			throw new IllegalArgumentException("Invalid date format or value: ");
		}
	}
}