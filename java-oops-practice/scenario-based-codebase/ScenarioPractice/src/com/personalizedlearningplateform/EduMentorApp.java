package com.personalizedlearningplateform;

import java.util.Arrays;

public class EduMentorApp {
	public static void main(String[] args) {
		
		Learner learner = new Learner("Akshay", "akshay@gmail.com", "AK01");
		Instructor instructor = new Instructor("Aman", "aman@gmail.com", "ak02");
		Quiz quiz = new Quiz(Arrays.asList("2+2 ? ", "Capital of India?"), Arrays.asList("4", "Delhi"), "Intermediate");
		
		int result = quiz.attemptQuiz(Arrays.asList("4", "Mumbai"));
        System.out.println("Learner Score: " + result + "%");

        ICertifiable certificate = result >= 60 ? new ShortTimeCourse() : new FullTimeCourse();
        System.out.println(certificate.generateCertificate());
	}
}