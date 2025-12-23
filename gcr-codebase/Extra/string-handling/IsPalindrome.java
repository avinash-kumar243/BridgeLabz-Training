// Writing a Java program to check if a given string is a palindrome
import java.util.Scanner;
public class IsPalindrome {
	
	// Writing a method to reverse string
	private static boolean isPalindrome(String str) {
		int st = 0, end = str.length() - 1;
		while(st < end) {
			if(str.charAt(st) != str.charAt(end)) return false;
			st++;
			end--;
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.next();
		
		// Calling a method to check if string palindrome or not
		boolean palindrome = isPalindrome(str);
		
		System.out.println("Is Palirndrom? " + palindrome);
	}
}