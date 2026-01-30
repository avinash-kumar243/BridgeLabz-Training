package com.interfaces.defaultmethods.dateexportfeature;

public class Main {
	public static void main(String[] args) {
		ReportExporter csv = new CSVExporter();
		ReportExporter pdf = new PDFExporter();
		ReportExporter custom = new CustomExporter();
		
		csv.export();
		csv.exportToJSON();
		
		pdf.export();
		pdf.exportToJSON();
		
		custom.export();
		custom.exportToJSON();
	}
}