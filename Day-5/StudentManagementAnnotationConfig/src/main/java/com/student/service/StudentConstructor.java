package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.model.Course;

@Component
public class StudentConstructor {
    private int id;
    private String name;
    private Course course;

    @Autowired		// Constructor Injection
    public StudentConstructor(Course course) {
        this.id = 102;
        this.name = "Avi";
        this.course = course;
    }

    public void display() {
        System.out.println("\n--- Constructor Injection ---");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course.getCourseName());
    }
}