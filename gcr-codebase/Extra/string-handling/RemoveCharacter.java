// Writing a Java program to Find the Most Frequent Character
import java.util.*;
public class RemoveCharacter {
	
	// Writing a method to compare two strings lexicographically
	private static String removeCharacter(String str, char c) {		
		StringBuilder sb = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(ch != c) sb.append(ch);
		}
		return sb.toString();
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String : ");
		String str = sc.nextLine();
		System.out.println("Enter a character to remove from string : ");
		char ch = sc.next().charAt(0);
		
		// Calling a method to Remove a Specific Character from a String
		String result = removeCharacter(str, ch);
		System.out.println("\nOld String is : " + str + "\nnew String is : " + result); 
	}
}