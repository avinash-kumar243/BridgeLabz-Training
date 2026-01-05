package com.collegeinformationsystem;

public class Main {
	public static void main(String[] args) {
		Faculty akshay = new Faculty("Akshay", "akshay@gmail.com", 101);
		
		Course math = new Course(201, "Math");
		math.assignFaculty(akshay);
		Course physics = new Course(202, "Physics");
		physics.assignFaculty(akshay);
		
				
		Student aman = new Student("Aman", "aman@gmail.com" , 1001);
		aman.enrollCourse(physics);
		aman.enrollCourse(math);
		Student deepanshu = new Student("Deepanshu", "deepanshu@gmail.com" , 1002);
		deepanshu.enrollCourse(physics);
		
		aman.asssignGrade(physics, 9.2);
		aman.asssignGrade(math, 8.5);
		deepanshu.asssignGrade(physics, 8.88);
		
		akshay.printDetails();
		aman.printDetails();
		deepanshu.printDetails();
	}
}