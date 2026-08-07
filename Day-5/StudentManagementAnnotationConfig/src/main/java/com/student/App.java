package com.student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.student.config.AppConfig;
import com.student.service.StudentConstructor;
import com.student.service.StudentField;
import com.student.service.StudentSetter;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentSetter setter = context.getBean(StudentSetter.class);
        setter.display();

        StudentConstructor constructor = context.getBean(StudentConstructor.class);
        constructor.display();

        StudentField field = context.getBean(StudentField.class);
        field.display();

        context.close();
    } 
}