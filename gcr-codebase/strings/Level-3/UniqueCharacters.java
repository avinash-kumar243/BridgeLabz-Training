import java.util.Scanner;
public class UniqueCharacters {

    // Method 1: Find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        for(char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method 2: Find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int len = findLength(text);

        // Temporary array to store unique characters
        char[] temp = new char[len];
        int uniqueCount = 0;

        for(int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check with previous characters
            for(int j = 0; j < i; j++) {
                if(current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                temp[uniqueCount++] = current;
            }
        }

        // Create exact-sized array for unique characters
        char[] result = new char[uniqueCount];
        for(int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);

        System.out.println("\nUnique characters in the string:");
        for(int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }
    }
}