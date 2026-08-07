package com.student.model;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private String courseName = "Spring Framework";

    public String getCourseName() {
        return courseName;
    }
}