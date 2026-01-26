package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define the annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

// Step 2: Apply annotation to methods
class PerformanceTest {

    @LogExecutionTime
    public void task1() {
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) sum += i;
    }

    @LogExecutionTime
    public void task2() {
        long product = 1;
        for (int i = 1; i < 10_000; i++) product *= 1; // dummy loop
    }

    public void task3() { // no annotation
        System.out.println("Normal task");
    }
}

// Step 3: Measure execution time using reflection
public class LogExecutionTimeDemo {
    public static void main(String[] args) throws Exception {
        PerformanceTest pt = new PerformanceTest();
        Method[] methods = PerformanceTest.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                method.invoke(pt); // execute the method
                long end = System.nanoTime();
                System.out.println("Execution time of " + method.getName() + ": " + (end - start) + " ns");
            }
        }
    }
}
