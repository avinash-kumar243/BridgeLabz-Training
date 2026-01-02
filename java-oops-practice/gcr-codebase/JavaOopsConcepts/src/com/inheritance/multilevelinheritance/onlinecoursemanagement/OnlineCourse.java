package com.inheritance.multilevelinheritance.onlinecoursemanagement;

public class OnlineCourse extends Course {
	protected String platform;
	protected boolean isRecorded;
	
	public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	
	@Override
	public String getCourseType() {
		return "Online Course";
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Plateform: " + platform + " || isRecorderd: " + isRecorded);
	}
}