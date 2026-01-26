package com.reflection;

import java.lang.reflect.Field;

class Person {
    private int age = 25;
}

public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {
        Person p = new Person();

        Class<?> c = p.getClass();
        Field f = c.getDeclaredField("age");

        f.setAccessible(true);   // allow access to private field
        f.setInt(p, 30);         // modify value

        System.out.println("Age: " + f.getInt(p)); // retrieve value
    }
}