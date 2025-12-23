// Writing a Java program to reverse a given string without using any built-in reverse functions
import java.util.Scanner;
public class ReverseString {
	
	// Writing a method to reverse string
	private static String reverse(String str) {
		char ch[] = str.toCharArray();
		int st = 0, end = ch.length - 1;
		while(st < end) {
			char temp = ch[st];
			ch[st] = ch[end];
			ch[end] = temp;
			st++;
			end--;
		}
		return new String(ch);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.next();
		
		// Calling a method to reverse a string
		String reversedStr = reverse(str);
		
		// Dispalying original and reversed string
		System.out.println("Original String is : " + str + ", and reversed String is : " + reversedStr);
	}
}