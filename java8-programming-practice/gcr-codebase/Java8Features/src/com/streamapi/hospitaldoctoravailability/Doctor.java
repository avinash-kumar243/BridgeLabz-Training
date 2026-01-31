package com.streamapi.hospitaldoctoravailability;

public class Doctor {
	private String name;
	private String speciality;
	private boolean isAvailableOnWeekend;
	
	public Doctor(String name, String speciality, boolean isAvailableOnWeekend) {
		this.name = name;
		this.speciality = speciality;
		this.isAvailableOnWeekend = isAvailableOnWeekend;
	}

	public String getName() {
		return name;
	}
	public boolean isAvailableOnWeekend() {
		return isAvailableOnWeekend;
	}
	public String getSpeciality() {
		return speciality;
	}

	@Override
	public String toString() {
		return name + " || Speciality: " + speciality + " || isAvailableOnWeekend: " + isAvailableOnWeekend;
	}	
}