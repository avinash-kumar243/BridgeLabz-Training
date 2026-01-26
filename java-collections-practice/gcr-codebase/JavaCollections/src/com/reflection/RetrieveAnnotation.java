package com.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // Make it available at runtime
@interface Author {
    String name();
}

// Step 2: Apply annotation to a class
@Author(name = "Avinash")
class SampleClass {
    public void display() {
        System.out.println("Inside SampleClass");
    }
}

// Step 3: Use Reflection to retrieve annotation value
public class RetrieveAnnotation {
    public static void main(String[] args) {
        Class<SampleClass> clazz = SampleClass.class;

        // Check if @Author annotation is present
        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author Name: " + author.name());
        } else {
            System.out.println("No Author annotation present.");
        }
    }
}