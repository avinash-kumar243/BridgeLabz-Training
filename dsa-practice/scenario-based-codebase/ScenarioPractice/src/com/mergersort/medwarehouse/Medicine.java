package com.mergersort.medwarehouse;

import java.time.LocalDate;

public class Medicine {
	private String medicineId;
	private LocalDate expiryDate;
	
	public Medicine(String medicineId, LocalDate expiryDate) {
		this.medicineId = medicineId;
		this.expiryDate = expiryDate;
	}

	public String getMedicineId() {
		return medicineId;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	
	
	@Override
	public String toString() {
		return "Medicine id: " + medicineId + ", expiry date: " + expiryDate; 
	}
}