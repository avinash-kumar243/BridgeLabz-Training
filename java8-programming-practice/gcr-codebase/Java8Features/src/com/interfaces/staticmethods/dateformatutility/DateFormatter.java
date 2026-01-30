package com.interfaces.staticmethods.dateformatutility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatter {
	static String formatDate(LocalDate date, String format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		return date.format(formatter); 
	}
}