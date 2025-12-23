// Writing a program to rim the leading and trailing spaces from a string using the charAt() method
import java.util.Scanner;
public class TrimLeadingTrailingSpaces {

    // Method to find start and end index after trimming spaces
    private static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while(start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while(end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for(int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with leading and trailing spaces :");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String customTrimmed = createSubstring(input, indexes[0], indexes[1]);

        // Built-in trim for comparison
        String builtInTrimmed = input.trim();

        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("\nAfter Custom Trim : [" + customTrimmed + "]");
        System.out.println("After Built-in Trim : [" + builtInTrimmed + "]");
        System.out.println("Are both strings equal? " + isSame);
    }
}