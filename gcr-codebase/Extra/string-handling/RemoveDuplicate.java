// Writing a Java program to remove duplicates
import java.util.*;
public class RemoveDuplicate {
	
	// Writing a method to remove duplicate
	private static String removeDuplicate(String str) {
		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		
		for(char ch : str.toCharArray()) {
			if(!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.next();
		
		// Calling a method and displaying string by removing duplicates
		String modifiedStr = removeDuplicate(str);
		System.out.println("Original String is " + str + ", and modified string is " + modifiedStr);
	}
}