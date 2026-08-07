package com.student;

public class Student {
    private int id;
    private String name;
    private Course course;

    // Constructors
    public Student() {}

    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    
    // Setters
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
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println(course + "\n");
    }
}