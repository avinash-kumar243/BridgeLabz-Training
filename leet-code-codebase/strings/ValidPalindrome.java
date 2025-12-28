// 125. Valid Palindrome
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.


class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if((c - 'a' >= 0 && 'z' - c >= 0) || (c - 'A' >= 0 && 'Z' - c >= 0)) {
                char ch = Character.toLowerCase(c);
                sb.append(ch);
            } else if(c - '0' >= 0 && '9' - c >= 0) {
                sb.append(c);
            }
        }
        String str = sb.toString();
        int n = str.length();
        int i=0;
        while(i < n/2) {
            if(str.charAt(i) != str.charAt(n-i-1)) return false;
            i++;
        }
        return true;
    }
}