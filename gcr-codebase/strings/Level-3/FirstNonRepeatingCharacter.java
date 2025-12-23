import java.util.Scanner;
public class FirstNonRepeatingCharacter {

    // Method: Find first non-repeating character using charAt()
    public static char findFirstNonRepeating(String text) {

        // Frequency array for 256 ASCII characters
        int[] freq = new int[256];

        // Step 1: Count frequency of each character
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Find first character with frequency 1
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        // If no non-repeating character found
        return '\0';
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);

        if(result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}