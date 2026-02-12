package com.json.convert_java_objects_to_json_array;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
    	return name;
	}
	public int getAge() {
		return age;
	}
}