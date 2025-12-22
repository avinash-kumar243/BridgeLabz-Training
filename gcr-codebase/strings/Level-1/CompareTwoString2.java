// Writing a program to compare two strings using the charAt() and substring() method and check the result 
import java.util.Scanner;
public class CompareTwoString2 {
	// Creating a substring from a string using the charAt() method
	public static String substringGeneration(String str, int st, int end) {
		String newStr = "";
		for(int i=st; i<end; i++) {
			newStr += str.charAt(i);
		}
		return newStr;
	}
	
	// Comparing two stings
	public static boolean stringComparision(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// entering firt string
		System.out.println("Enter First String : ");
		String str1 = sc.next();		
		System.out.println("Enter start and end index for string 1 : ");
		int st1 = sc.nextInt();
		int end1 = sc.nextInt();
		
		String substringOfStr1 = substringGeneration(str1, st1, end1);
		
		System.out.println("Substring of string " + str1 + " is - " + substringOfStr1); 
		
		
		// entering second string
		System.out.println("\nEnter Second String : ");
		String str2 = sc.next();		
		System.out.println("Enter start and end index for string 2 : ");
		int st2 = sc.nextInt();
		int end2 = sc.nextInt();
		
		String substringOfStr2 = substringGeneration(str2, st2, end2);
		
		System.out.println("\nSubstring of string " + str2 + " is - " + substringOfStr2);
		
		
		// String comparision
		if(stringComparision(str1, str2)) System.out.println("Both Strings are equal! " + str1);
		else System.out.println("\nBoth Strings are different");
	}
}