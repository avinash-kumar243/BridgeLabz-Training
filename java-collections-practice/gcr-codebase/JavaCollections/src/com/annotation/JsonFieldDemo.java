package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;

// Step 1: Define the annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name(); // custom key for JSON
}

// Step 2: User class with annotated fields
class UserDemo {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    private int age; // not annotated, will be ignored

    public UserDemo(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}

// Step 3: Method to convert object to JSON using annotation
class JsonSerializer {
    public static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                if (!first) json.append(", ");
                JsonField annotation = field.getAnnotation(JsonField.class);
                json.append("\"").append(annotation.name()).append("\": ");
                Object value = field.get(obj);
                json.append("\"").append(value).append("\"");
                first = false;
            }
        }

        json.append("}");
        return json.toString();
    }
}

// Step 4: Test
public class JsonFieldDemo {
    public static void main(String[] args) throws Exception {
    	UserDemo user = new UserDemo("Alice", "alice@example.com", 25);
        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
