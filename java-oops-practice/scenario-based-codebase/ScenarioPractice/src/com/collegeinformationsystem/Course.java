package com.collegeinformationsystem;

import java.util.ArrayList;
import java.util.List;
public class Course {
	
	private int courseId; 
	private String title; 
	private Faculty faculty;
	private List<Student> enrolledStudent = new ArrayList<>();
	
	public Course(int courseId, String title) {
		this.courseId = courseId;
		this.title = title;
	}
	
	public void assignFaculty(Faculty faculty) {
		this.faculty = faculty;
		faculty.assignCourse(this);
	}
	public void removeStudent(Student s) {
		enrolledStudent.remove(s);
	}
	public void enrolledStudent(Student student) {
		enrolledStudent.add(student);		
	}
	public String getTitle() {
		return this.title;
	}
}