package com.generics.coursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Class - University System
public class Main {
	public static void main(String[] args) {
		
		// Exam Course
		Course<ExamCourse> ds = new Course<>("Data Structure", new ExamCourse());
		
		// Research Course
		Course<ResearchCourse> aiProject = new Course<>("AIProject", new ResearchCourse());
		
		
		List<Course<? extends CourseType>> courses = new ArrayList<>();
		courses.add(ds);
		courses.add(aiProject);
		
		for(Course<? extends CourseType> course : courses) {
			course.evaluateCourse();
		}
	}
} 