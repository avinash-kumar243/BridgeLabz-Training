package com.reflection;

import java.lang.reflect.Field;
import java.util.Map;

class Persons {
    private String name;
    private int age;
    private boolean active;

    @Override
    public String toString() {
        return "Persons{name='" + name + "', age=" + age + ", active=" + active + "}";
    }
}

public class CustomObjectMapper {

    // Generic method to map properties to object fields
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        // Step 1: Create new instance using no-arg constructor
        T obj = clazz.getDeclaredConstructor().newInstance();

        // Step 2: Iterate through all declared fields
        for(Field field : clazz.getDeclaredFields()) {
            String fieldName = field.getName();

            // If map contains value for this field
            if(properties.containsKey(fieldName)) {
                field.setAccessible(true); // allow access to private field
                Object value = properties.get(fieldName);

                // Handle primitive types conversion if needed
                if(field.getType().isPrimitive()) {
                    if(field.getType() == int.class) {
                        field.setInt(obj, ((Number) value).intValue());
                    } else if(field.getType() == boolean.class) {
                        field.setBoolean(obj, (Boolean) value);
                    } else if(field.getType() == double.class) {
                        field.setDouble(obj, ((Number) value).doubleValue());
                    } else if(field.getType() == long.class) {
                        field.setLong(obj, ((Number) value).longValue());
                    }
                    // Add more primitive types if needed
                } else {
                    field.set(obj, value); // for objects like String, Integer, etc.
                }
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> data = Map.of(
            "name", "Avinash",
            "age", 25,
            "active", true
        );

        Persons persons = toObject(Persons.class, data);
        System.out.println(persons);
    }
}