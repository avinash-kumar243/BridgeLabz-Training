package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.model.Course;

@Component
public class StudentField {
    private int id = 103;
    private String name = "Rohit";

    @Autowired 		// Field Injection
    private Course course;

    public void display() {
        System.out.println("\n--- Field Injection ---");
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Course : " + course.getCourseName());
    }
}