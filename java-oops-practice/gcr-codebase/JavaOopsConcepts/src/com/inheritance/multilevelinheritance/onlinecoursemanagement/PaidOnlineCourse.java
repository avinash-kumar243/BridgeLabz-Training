package com.inheritance.multilevelinheritance.onlinecoursemanagement;

public class PaidOnlineCourse extends OnlineCourse {
	protected double fee;
	protected double discount;
	
	public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
		super(courseName, duration, platform, isRecorded); 
		this.fee = fee;
		this.discount = discount;
	}
	
	public double getFinalFee() {
		return fee - (fee * discount / 100);
	}
	
	@Override
	public String getCourseType() {
		return "Paid Online Course ]";
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Fee: " + fee + " || discount: " + discount);
	}
}   