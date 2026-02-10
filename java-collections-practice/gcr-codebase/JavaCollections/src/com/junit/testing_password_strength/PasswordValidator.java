package com.junit.testing_password_strength;

public class PasswordValidator {
	
	String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,}$";
	
	public boolean passwordValidator(String password) {
		if(password == null) {
			throw new NullPointerException("Password is null!!!");
		}
		
		if(password.matches(regex)) {
			return true;
		} else {
			return false;
		} 
	}
}