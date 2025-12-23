// Writing a Java program to Find the Most Frequent Character
import java.util.*;
public class MostFrequentCharacter {
	
	// Writing a method to compare two strings lexicographically
	private static char mostFrequentChar(String str) {		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		int count = 0;
		char frequentChar = ' ';
		for(Map.Entry<Character, Integer> emt : map.entrySet()) {
			char ch = emt.getKey();
			int freq = emt.getValue();
			
			if(count < freq) {
				frequentChar = ch;
				count = freq; 
			}
		}
		return frequentChar;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String : ");
		String str = sc.nextLine();
		
		// Calling a method to Find the Most Frequent Character
		char frequentChar = mostFrequentChar(str);
		System.out.println("Most Frequent char is : " + frequentChar); 
	}
}