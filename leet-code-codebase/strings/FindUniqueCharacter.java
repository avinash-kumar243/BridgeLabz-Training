// 387. First Unique Character in a String

// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.


import java.util.Scanner;
class FindUniqueCharacter {
	
	// Find index of first unique character
    public static int firstUniqChar(String s) {
        int freq[] = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int idx = 0;
        for(char ch : s.toCharArray()) {
            if(freq[ch - 'a'] == 1) {
                return idx;
            }
            idx++;
        }
        return -1;
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = "lleetcode";
		
		System.out.println(firstUniqChar(str));
	}
}