package com.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.student.model.Course;
import com.student.service.StudentConstructor;
import com.student.service.StudentSetter;

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        Course course = new Course();
        course.setCourseName("Spring Framework");

        return course;
    }
    
    @Bean
    public StudentSetter studentSetter() {
        StudentSetter student = new StudentSetter();
        student.setId(101);
        student.setName("Rahul");
        student.setCourse(course());

        return student;
    }

    @Bean
    public StudentConstructor studentConstructor() {
        return new StudentConstructor(102, "Avi", course());
    } 
}