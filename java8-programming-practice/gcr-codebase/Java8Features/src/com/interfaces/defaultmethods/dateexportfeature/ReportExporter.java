package com.interfaces.defaultmethods.dateexportfeature;

public interface ReportExporter {
	
	// abstract method
	void export();
	
	// new feature added later
	default void exportToJSON() {
		System.out.println("Exporting report to JSON format (default implementation)");
	}
}