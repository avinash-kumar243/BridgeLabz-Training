// Writing a Java program to returns the longest word in the sentence
import java.util.Scanner;
public class LongestWord {
	
	// Writing a method to returns the longest word in the sentence
	private static String longestWord(String str) {
		String words[] = str.trim().split(" ");
		
		String result = "";
		int maxLen = 0;
		for(String word : words) {
			if(word.length() > maxLen) {
				result = word;
				maxLen = word.length();
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		// Calling a method to returns the longest word in the sentence
		String resultStr = longestWord(str);
		System.out.println("Longest String is " + resultStr);
	}
}