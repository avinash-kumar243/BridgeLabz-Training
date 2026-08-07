package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.model.Course;

@Component
public class StudentSetter {
    private int id;
    private String name;
    private Course course;

    public StudentSetter() {
        this.id = 101;
        this.name = "Rahul";
    }

    @Autowired   // Setter Injection
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