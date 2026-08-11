package com.student.model;

public class Course {
    private String courseName;

    // Constructors
    public Course() {}

    public Course(String courseName) {
        this.courseName = courseName;
    }

    
    // Setter
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName;
    }
}