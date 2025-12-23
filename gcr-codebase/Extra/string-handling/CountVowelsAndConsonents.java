// Writing a Java program to count the number of vowels and consonants in a given string.
import java.util.Scanner;
public class CountVowelsAndConsonents {
	
	// Writing a method to count vowels
	private static int countVowels(String str) {
		int count = 0;
		for(char ch : str.toCharArray()) {
			if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||  ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') count++;
		}
		return count;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.next();
		
		// Calculating total vowels and consonants
		int vowels = countVowels(str);
		int consonants = str.length() - vowels;
		
		// Dispalying total number of vowels and consonants
		System.out.println("Total vowels are : " + vowels + ", and consonants are : " + consonants);
	}
}