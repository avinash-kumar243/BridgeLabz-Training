// Writing a program to Create a NumberChecker utility class and perform given tasks
import java.util.*;
public class NumberChecker4 {
	// Method to check if a number is prime or not
	public static boolean isPrime(int number) {
		for(int i=2; i<=(int)Math.sqrt(number); i++) {
			if(number % i == 0) return false;
		}
		return true;
	}
	
	// Method to check if a number is neon or not
	public static boolean isNeon(int number) {
		int sum = 0, originalNumber = number;
		while(number != 0) {
			int num = number % 10;
			sum += Math.pow(num, 2);
			number /= 10;
		}
		return sum == originalNumber;
	}
	
	// Method to check if a number is spy or not
	public static int isSpy(int number) {
		int sum = 0, product = 1;
		for(int num : digits) {
			sum += num;
			product *= num;
		}
		return sum == product;
	}
	
	// Method to check if a number is automorphic or not
	public static boolean isAutomorphic(int number) {
		int square = num * num;

		while(number > 0) {
			if(number % 10 != square % 10) {
				return false;
			}
			temp /= 10;
			square /= 10;
		}
		return true;
	}
	
	// Method to check if a number is a buzz or not
	public static boolean isBuzz(int number) {
		return (num % 10 == 7) || (num % 7 == 0);
	}
}