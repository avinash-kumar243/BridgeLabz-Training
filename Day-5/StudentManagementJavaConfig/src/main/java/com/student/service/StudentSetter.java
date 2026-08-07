package com.student.service;

import com.student.model.Course;

public class StudentSetter {
    private int id;
    private String name;
    private Course course;

    public StudentSetter() {}

    
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    public void display() {
        System.out.println("\n--- Setter Injection ---");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course.getCourseName());
    }
}