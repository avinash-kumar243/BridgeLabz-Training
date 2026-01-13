package com.emergencypatientnavigation;

public class Patient {
	private String patientId;
	private String patientName;
	private String patientAge;
	
	public Patient(String patientId, String patientName, String patientAge) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
	}

	
	// Getters and Setters
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}
	
	
}