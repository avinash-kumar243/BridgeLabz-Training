package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class GetClassInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fully qualified class name: ");
        String className = sc.nextLine();

        try {
            // Load class dynamically
            Class<?> cls = Class.forName(className);
            System.out.println("\nClass Name: " + cls.getName());

            // Display Constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            
            for(Constructor<?> c : constructors) {
                System.out.println(c);
            }

            // Display Fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            
            for(Field f : fields) {
                System.out.println(f);
            }

            // Display Methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            
            for(Method m : methods) {
                System.out.println(m);
            }

        } catch(ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}