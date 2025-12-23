// Writing a Java program to count how many times a given substring occurs in a string
import java.util.Scanner;
public class SubstringOccuranceCount {
	
	// Writing a method to count number of substring
	private static int countSubstring(String str, String substring) {
		String words[] = str.trim().split(" ");
		
		int count = 0;
		for(String word : words) {
			if(word.equals(substring)) count++;
		}
		return count;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		System.out.println("Enter a substring : ");
		String substring = sc.nextLine();
		
		// Calling a method to returns number of substring
		int count = countSubstring(str, substring);
		System.out.println("Total count of substring is : " + count);
	}
}