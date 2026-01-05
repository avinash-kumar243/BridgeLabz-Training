package com.collegeinformationsystem;

import java.util.*;
public class Student extends Person implements ICourseActions {
	// public String grade;
	private Map<Course, Double> grades = new HashMap<>();
	private List<Course> enrolledCourse = new ArrayList<>();
	
	public Student(String name, String email, int id) {
		super(name, email, id);
	}
	
	public void asssignGrade(Course course, double grade) {
		 grades.put(course, grade);
	}
	
	public double calculateGpa() {
		double total = 0;
		for(double g : grades.values()) {
			total += g;
		}
		return grades.isEmpty() ? 0 : total / grades.size();
	}
	
	@Override
	public void enrollCourse(Course course) {
		if(!enrolledCourse.contains(course)) {
			enrolledCourse.add(course);
			course.enrolledStudent(this);
			System.out.println(name + " has enrolled " + course.getTitle() + " course");
		}
		
	}
	@Override
	public void dropCourse(Course course) {
		if(enrolledCourse.remove(course)) {
			course.removeStudent(this);
			System.out.println("\n" + name + " has dropped his " + course.getTitle() + " course");
		}
	}
	
	@Override
	public void printDetails() {
		System.out.println("\nStudent: " + name + " || email: " + email + " || and his GPA: " + calculateGpa());
	}
}