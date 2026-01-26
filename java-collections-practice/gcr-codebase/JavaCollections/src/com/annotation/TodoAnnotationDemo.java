package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)  // available at runtime
@Target(ElementType.METHOD)          // can only be applied to methods
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

// Step 2: Apply annotation to multiple methods
class ProjectModule {

    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void login() {
        System.out.println("Login feature in progress...");
    }

    @Todo(task = "Add search functionality", assignedTo = "Bob")
    public void search() {
        System.out.println("Search functionality pending...");
    }

    @Todo(task = "Integrate payment gateway", assignedTo = "Charlie", priority = "HIGH")
    public void payment() {
        System.out.println("Payment integration pending...");
    }

    public void completedFeature() {
        System.out.println("Completed feature, no TODO here.");
    }
}

// Step 3: Retrieve all pending tasks using Reflection
public class TodoAnnotationDemo {
    public static void main(String[] args) throws Exception {
        Method[] methods = ProjectModule.class.getDeclaredMethods();

        System.out.println("Pending Tasks:");
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println("--------------------------");
            }
        }
    }
}
