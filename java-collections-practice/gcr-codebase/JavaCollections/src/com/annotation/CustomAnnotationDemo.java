package com.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Step 1: Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)  // Annotation is available at runtime
@Target(ElementType.METHOD)          // Can be applied to methods only
@interface TaskInfo {
    String priority() default "Medium";
    String assignedTo() default "Unknown";
}

// Step 2: Apply annotation to a method in TaskManager
class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Task completed successfully!");
    }

    @TaskInfo(priority = "Low", assignedTo = "Bob")
    public void reviewTask() {
        System.out.println("Task reviewed successfully!");
    }
}

// Step 3: Retrieve annotation details using Reflection
public class CustomAnnotationDemo {
    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();

        // Get all methods of TaskManager
        Method[] methods = TaskManager.class.getDeclaredMethods();

        for (Method method : methods) {
            // Check if the method has TaskInfo annotation
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
                System.out.println("---------------------------");
            }
        }
    }
}
