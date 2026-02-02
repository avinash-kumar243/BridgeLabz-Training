package com.questions.functionalinterface.supplier;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class AllOperations {
	public static void main(String[] args) {

//		1.Generate OTP using Supplier.
//		
//		2.Generate random student ID using Supplier.
//		
//		3.Provide current date and time using Supplier.
//		
//		4.Provide default welcome message using Supplier.
//		
//		5.Generate random discount coupon using Supplier.
		
		
		
		System.out.println("\n1. ----------- Generate OTP using Supplier ------------");
		
		Supplier<String> otpGenerator = () -> {
			Random random = new Random();
			int otp = random.nextInt(900000) + 100000;
			return String.valueOf(otp);			
		};
		System.out.println("Generated otp: " + otpGenerator.get()); 
		
		
		
		System.out.println("\n2. ------------ Generate random student ID using Supplier -------------");
		
		Supplier<String> studentIdGenerator = () -> {
			Random random = new Random();
			int studentId = random.nextInt(900) + 100;
			return String.valueOf(studentId);
		};
		System.out.println("Generated student id: " + studentIdGenerator.get());
		
		
		
		System.out.println("\n3. --------------- Provide current date and time using Supplier ----------------");
		
		Supplier<LocalDateTime> currentDateTime = () -> {
			LocalDateTime time = LocalDateTime.now();
			return time;
		};
		
		System.out.println("Current date and time: " + currentDateTime.get());
		
		
		
		System.out.println("\n4. --------------- Provide default welcome message using Supplier ----------------");
		
		Supplier<String> welcomeMsg = () -> {
			return "Welcome to our plateform!!!";
		};
		
		System.out.println("Default welcome message: " + welcomeMsg.get());
		
		
		
		System.out.println("\n5. --------------- Generate random discount coupon using Supplier ---------------");

		Supplier<Integer> coupon = () -> {
			Random random = new Random();
			int discount = random.nextInt(9000) + 1000;
			return discount;
		};
		
		System.out.println("Random discount: " + coupon.get());
	}
}