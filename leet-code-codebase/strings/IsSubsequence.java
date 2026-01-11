// 392. Is Subsequence

// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters 
// without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).


public class IsSubsequence {
	public static boolean isSubsequence(String s, String t) {
        int n = s.length();
        if(n == 0) return true;
        if(t.length() < n) return false;
        else if(t.equalsIgnoreCase(s)) return true;
        
        int idx = 0;
        char ch = s.charAt(idx);
        for(int i=0; i<t.length(); i++) {
            if(ch == t.charAt(i)) {
                idx++;
                if(idx == n) return true;
                else ch = s.charAt(idx);
            }
        }
        return false;
    }
	public static void main(String args[]) {
		String t = "ahbgdc";
		String s = "abc";
		
		boolean result = isSubsequence(s, t);
		System.out.println("Is subsequnce: " + result);
	}
}