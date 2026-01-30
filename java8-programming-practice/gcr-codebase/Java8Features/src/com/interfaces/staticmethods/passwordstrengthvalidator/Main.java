package com.interfaces.staticmethods.passwordstrengthvalidator;

public class Main {
	public static void main(String[] args) {
		String password1 = "Aman@#123";
		String password2 = "Avi@123";
		
		System.out.println("Is strong password: " + SecurityUtils.validatePasswordStrength(password1));
		System.out.println("Is strong password: " + SecurityUtils.validatePasswordStrength(password2));
	}
}