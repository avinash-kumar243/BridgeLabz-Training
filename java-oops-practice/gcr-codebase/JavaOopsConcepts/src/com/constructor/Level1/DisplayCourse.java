package com.constructor.Level1;

public class DisplayCourse {
	public static void main(String[] args) {
		Course course1 = new Course("Java", 60, 2000);
		Course course2 = new Course("Python", 40, 1000);
		Course course3 = new Course("C++", 45, 1600);
		
		// Instance methods are called through objects
		course1.displayCourseDetails();
		course2.displayCourseDetails();
		course3.displayCourseDetails();
		
		// Class method is called through Class
		Course.printInstituteName();
		Course.updateInstituteName("Noida University");
		Course.printInstituteName();
	}
}