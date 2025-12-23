// Writing a Java program to checks if the two strings are anagrams of each other
import java.util.*;
public class IsAnagram {
	
	// Writing a method to checks if the two strings are anagrams of each other
	private static boolean isAnagram(String str1, String str2) {		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(char ch : str1.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}
		for(char ch : str2.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
		}
		return map1.equals(map2);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter second String : ");
		String str2 = sc.nextLine();
		
		// Calling a method to checks if the two strings are anagrams of each other
		boolean isAnagram = isAnagram(str1, str2);
		System.out.println("Is Anagram? " + isAnagram);
	}
}