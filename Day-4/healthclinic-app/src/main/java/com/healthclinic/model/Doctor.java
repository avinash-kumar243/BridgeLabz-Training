package com.healthclinic.model;

public class Doctor {
	private int doctor_id;
	private String name;
	private String phone;
	private String email;
	private double fees;
	private int experience;
	private int specializationId;
	
	public Doctor() {};
	
	public Doctor(int doctor_id, String name, String phone, String email, double fees, int experience, int specializationId) {
		this.doctor_id = doctor_id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.fees = fees; 
		this.experience = experience;
		this.specializationId = specializationId;
	}

	// Getters and Setters
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}	
	public int getSpecializationId() {
		return specializationId;
	}
	public void setSpecializationId(int specializationId) {
		this.specializationId = specializationId;
	}

	@Override
	public String toString() {
		return "Doctor [doctor_id: " + doctor_id + ", name: " + name + ", phone: " + phone + ", email: " + email + ", fees: "
				+ fees + ", experience: " + experience + ", specializationId: " + specializationId + "]";
	}
}