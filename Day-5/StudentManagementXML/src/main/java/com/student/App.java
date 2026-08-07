package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    		
        Student setterStudent = context.getBean("studentSetter", Student.class);
        setterStudent.display();
        
        
        Student constructorStudent = context.getBean("studentConstructor", Student.class);
        constructorStudent.display();
    } 
}  