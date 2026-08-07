package com.student.service;

import com.student.model.Course;

public class StudentConstructor {
    private int id;
    private String name;
    private Course course;

    public StudentConstructor(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("\n--- Constructor Injection ---");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course.getCourseName());
    }
}