package com.interfaces.defaultmethods.dateexportfeature;

public class CSVExporter implements ReportExporter {

	@Override
	public void export() {
		System.out.println("\nExporting report in CSV format");
	}
}