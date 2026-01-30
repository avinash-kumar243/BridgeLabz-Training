package com.interfaces.defaultmethods.dateexportfeature;

public class CustomExporter implements ReportExporter {

	@Override
	public void export() {
		System.out.println("\nExporting report in Custom format");
	}
	
	@Override
	public void exportToJSON() {
		System.out.println("Exporting report in JSON format (custom implementation)");
	}
}