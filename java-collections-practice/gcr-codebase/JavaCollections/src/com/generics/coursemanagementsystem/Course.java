package com.generics.coursemanagementsystem;


// Real Course
class Course<T extends CourseType> {  // Generic used here - This course can only work with valid course evaluation type
	private String courseName;
	private T evaluationType;
	
	public Course(String courseName, T evaluationType) {
		this.courseName = courseName;
		this.evaluationType = evaluationType;
	}

	
// Getters for Course name and department
//	public String getCourseName() {
//		return courseName;
//	}
//	public T getDepartment() {
//		return evaluationType;
//	}
//	 
//	
//	@Override
//	public String toString() {
//		return "Course name: " + courseName + ", department: " + evaluationType; 
//	}


	public void evaluateCourse() {
		System.out.println("Course: " + courseName);
		evaluationType.evaluate();		// Delegation
	}
}