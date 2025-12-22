// Writing a program to Create a NumberChecker utility class and perform given tasks
import java.util.*;
public class NumberChecker5 {
	// Method to check if a number is a perfect number or not
	public static boolean isPerfect(int num) {
		if(num <= 1) return false;
		int sum = 0;
		for(int i = 1; i <= num/2; i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}

	// Method to check if a number is abundant number or not
	public static boolean isDeficient(int num) {
		if(num <= 1) return true;

		int sum = 0;
		for(int i = 1; i <= num/2; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum < num;
	}

	
	// Method to check if a number is Deficient or not
	public static boolean isDeficient(int num) {
		if(num <= 1) return true;

		int sum = 0;
		for(int i = 1; i <= num/2; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum < num;
	}

	// Method to check if a number is strong or not
	public static boolean isStrongNumber(int number) {
		int originalNumber = number;
		int sum = 0;

		while(number > 0) {
			int digit = number % 10;

			// factorial calculation
			int fact = 1;
			for(int i = 1; i <= digit; i++) {
				fact *= i;
			}
			sum += fact;
			number /= 10;
		}
		return sum == originalNumber;
	}
}