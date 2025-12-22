// Writing a program to compare two strings using the charAt() method and check the result 
import java.util.Scanner;
public class StringComparision {
	// A method that will convert string into character of array
	public static char[] getCharacters(String str) {
		char ch[] = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		return ch;
	}
	
	// Writing a method to compare two string arrays
	public static boolean stringComparision(char str1[], char str2[]) {
		if(str1.length != str2.length) return false;
		
		for(int i=0; i<str1.length; i++) {
			if(str1[i] != str2[i]) return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// entering firt string
		System.out.println("Enter two Strings : ");
		String str1 = sc.next();
		String str2 = sc.next();
		
		char ch1[] = getCharacters(str1);
		char ch2[] = getCharacters(str2);
		
		char ch3[] = str1.toCharArray();
		char ch4[] = str2.toCharArray();
		
		if(stringComparision(ch1, ch3)) System.out.println("Both way to convert string into char of array are equal");
		if(stringComparision(ch2, ch4)) System.out.println("Both way to convert string into char of array are equal");
	}
}