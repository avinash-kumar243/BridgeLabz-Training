// Writing a Java program to compare two strings lexicographically
import java.util.*;
public class CompareTwoString {
	
	// Writing a method to compare two strings lexicographically
	private static int compareString(String str1, String str2) {		
		if(str1.length() < str2.length()) return 1;
		else if(str1.length() > str2.length()) return -1;
		
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i) < str2.charAt(i)) return 1;
			else if(str1.charAt(i) > str2.charAt(i)) return -1;
		}
		return 0;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String : ");
		String str1 = sc.next();
		System.out.println("Enter second String : ");
		String str2 = sc.next();
		
		// Calling a method to compare two strings lexicographically
		int status = compareString(str1, str2);
		
		if(status == 1) System.out.println("\"" + str1 + "\"" + " comes before " + "\"" + str2 + "\"" + " in lexicographically order");
		else if(status == -1) System.out.println("\"" + str2 + "\"" + " comes before " + "\"" + str1 + "\"" + " in lexicographically order");
		else System.out.println("Equal Strings");
	}
}