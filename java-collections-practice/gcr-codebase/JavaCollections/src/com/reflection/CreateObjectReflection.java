package com.reflection;

class Student {
    int id;
    String name;

    public Student() {
        id = 101;
        name = "Avinash";
    }

    public void display() {
        System.out.println(id + " " + name);
    }
}
public class CreateObjectReflection {
    public static void main(String[] args) throws Exception {

        Class<?> c = Class.forName("com.reflection.Student"); // load class
        Object obj = c.getDeclaredConstructor().newInstance(); // create object

        Student s = (Student) obj; // type cast
        s.display();
    }
}