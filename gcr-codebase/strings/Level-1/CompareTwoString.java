// Writing a program to compare two strings using the charAt() method and check the result 
import java.util.Scanner;
public class CompareTwoString {
	public static boolean stringComparision(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) return false;
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two Strings : ");
		String s1 = sc.next();
		String s2 = sc.next();
		
		if(stringComparision(s1, s2)) System.out.println("Both Strings are equal! " + s1);
		else System.out.println("Both Strings are different");
	}
}