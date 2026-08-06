package com.healthclinic.model;

public class Stats {
	private int doctorId;
	private int patientCount;
	
	public Stats(int doctorId, int patientCount) {
		this.doctorId = doctorId;
		this.patientCount = patientCount;
	}

	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public int getPatientCount() {
		return patientCount;
	}
	public void setPatientCount(int patientCount) {
		this.patientCount = patientCount;
	}

	@Override
	public String toString() {
		return "Stats [doctorId: " + doctorId + ", patientCount: " + patientCount + "]";
	}
	
}