package com.reflection;

import java.lang.reflect.Field;

class Person2 {
    private String name;
    private int age;
    private boolean active;

    public Person2(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }
}

public class ObjectToJson {

    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder();
        Class<?> clazz = obj.getClass();
        json.append("{");

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            String name = field.getName();
            Object value = field.get(obj);

            json.append("\"").append(name).append("\":");

            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value);
            }

            if (i < fields.length - 1) {
                json.append(", ");
            }
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        Person2 person = new Person2("Avinash", 25, true);

        String json = toJson(person);
        System.out.println(json);
    }
}
