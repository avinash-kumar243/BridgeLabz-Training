package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define class-level annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface RoleAllowed {
    String value(); // role required to access
}

// Step 2: Annotate class with required role
@RoleAllowed("ADMIN")
class AdminOperations {
    public void deleteUser() {
        System.out.println("User deleted successfully.");
    }

    public void updateSettings() {
        System.out.println("Settings updated successfully.");
    }
}

// Step 3: Simulate user roles and check access
public class RoleBasedAccessDemo {
    public static void main(String[] args) throws Exception {
        String currentUserRole = "USER"; // change to ADMIN to allow access

        Class<AdminOperations> clazz = AdminOperations.class;

        // Check if class has RoleAllowed annotation
        if (clazz.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed role = clazz.getAnnotation(RoleAllowed.class);
            if (role.value().equals(currentUserRole)) {
                AdminOperations ops = clazz.getDeclaredConstructor().newInstance();
                // invoke all methods
                for (Method method : clazz.getDeclaredMethods()) {
                    method.invoke(ops);
                }
            } else {
                System.out.println("Access Denied! Only " + role.value() + " can access.");
            }
        }
    }
}
