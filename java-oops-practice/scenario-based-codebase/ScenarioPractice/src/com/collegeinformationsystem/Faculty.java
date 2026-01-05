package com.collegeinformationsystem;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
	public List<Course> teachingCourses = new ArrayList<>();
	// Implementation need : Maintain list of courses taught
	
	public Faculty(String name, String email, int id) {
		super(name, email, id);
	}
	
	public void assignCourse(Course course) {
		teachingCourses.add(course);
	}
	
	@Override
	public void printDetails() {
		System.out.println("\nFaculty: " + name + " || Email: " + email + " || Courses teaching: " + teachingCourses.size());
	}
}