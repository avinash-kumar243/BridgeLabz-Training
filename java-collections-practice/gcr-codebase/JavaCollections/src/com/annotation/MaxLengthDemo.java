package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;

// Step 1: Define the field-level annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value(); // maximum allowed length
}

// Step 2: User class with validation in constructor
class User {

    @MaxLength(10)
    private String username;

    public User(String username) throws Exception {
        this.username = username;
        validateFields(); // validate annotated fields
    }

    // Step 3: Validation logic
    private void validateFields() throws Exception {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                field.setAccessible(true); // access private fields
                Object value = field.get(this);
                if (value instanceof String) {
                    int max = field.getAnnotation(MaxLength.class).value();
                    if (((String) value).length() > max) {
                        throw new IllegalArgumentException(
                            field.getName() + " length exceeds maximum of " + max
                        );
                    }
                }
            }
        }
    }

    public String getUsername() {
        return username;
    }
}

// Step 4: Test
public class MaxLengthDemo {
    public static void main(String[] args) throws Exception {
        User user1 = new User("Alice"); // valid
        System.out.println("User created: " + user1.getUsername());

        User user2 = new User("VeryLongUsername"); // exceeds max length
        System.out.println("User created: " + user2.getUsername());
    }
}
