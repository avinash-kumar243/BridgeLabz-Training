// Writing a Java program to toggle the case of each character in a given string
import java.util.*;
public class TogggleOfCharacters {
	
	// Writing a method to count number of substring
	private static String toggleString(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(char ch : str.toCharArray()) {
			if(ch - 'a' >= 0 && 'z' - ch >= 0) sb.append(Character.toUpperCase(ch));
			else sb.append(Character.toLowerCase(ch));
		}
		return sb.toString();
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
				
		// Calling a method to toggle the case of each character in a given string
		String result = toggleString(str);
		System.out.println("Original String is " + str + ", and Toggled String is : " + result);
	}
}