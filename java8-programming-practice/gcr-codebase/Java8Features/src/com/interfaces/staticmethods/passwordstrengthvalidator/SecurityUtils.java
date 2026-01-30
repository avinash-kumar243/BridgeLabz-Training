package com.interfaces.staticmethods.passwordstrengthvalidator;

public interface SecurityUtils {
	static boolean validatePasswordStrength(String password) {
		if(password.equalsIgnoreCase(null)) return false;
		
		return password.length() >= 8 && 
			   password.matches(".*[A-Z].*") && 
			   password.matches(".*[a-z].*") &&
			   password.matches(".*\\d.*") &&
			   password.matches(".*[@#$%!].*"); 
	}
}