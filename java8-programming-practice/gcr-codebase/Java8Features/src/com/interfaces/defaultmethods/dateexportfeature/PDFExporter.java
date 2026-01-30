package com.interfaces.defaultmethods.dateexportfeature;

public class PDFExporter implements ReportExporter {

	@Override
	public void export() {
		System.out.println("\nExporting report in PDF format");
	}
}