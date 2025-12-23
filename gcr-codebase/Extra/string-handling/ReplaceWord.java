// Writing a replace method in Java that replaces a given word with another word in a sentence
import java.util.*;
public class ReplaceWord {
	
	// Writing a method that replaces a given word with another word in a sentence
	private static String replaceWord(String str1, String str2, String str3) {		
		return str1.replace(str2, str3);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence : ");
		String str1 = sc.nextLine();
		System.out.println("Enter a String : ");
		String str2 = sc.nextLine();
		System.out.println("Enter a String : ");
		String str3 = sc.nextLine();
		
		// Calling a method to checks if the two strings are anagrams of each other
		String result = replaceWord(str1, str2, str3);
		System.out.println("Original Sentence is : " + str1 + "\nModified String is : " + result);
	}
}