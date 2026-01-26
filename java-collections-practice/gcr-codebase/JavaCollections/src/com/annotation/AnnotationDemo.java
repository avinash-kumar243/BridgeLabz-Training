package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)  // available at runtime
@Target(ElementType.METHOD)          // can only be applied to methods
@interface ImportantMethod {
    String level() default "HIGH";   // optional parameter
}

// Step 2: Apply annotation to methods
class TaskManager2 {
    @ImportantMethod
    public void startTask() {
        System.out.println("Starting task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void reviewTask() {
        System.out.println("Reviewing task...");
    }

    public void otherTask() {
        System.out.println("Other task...");
    }
}

// Step 3: Retrieve annotated methods using Reflection
public class AnnotationDemo {
    public static void main(String[] args) throws Exception {
        Method[] methods = TaskManager2.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + im.level());
            }
        }
    }
}
