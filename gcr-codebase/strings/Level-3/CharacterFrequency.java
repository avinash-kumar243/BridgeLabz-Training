import java.util.Scanner;
public class CharacterFrequency {

    // Method: Find frequency of characters using charAt()
    public static String[][] findCharacterFrequency(String text) {
        // Frequency array for 256 ASCII characters
        int[] freq = new int[256];

        // Step 1: Count frequency of each character
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Count number of unique characters
        int uniqueCount = 0;
        for(int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Step 3: Create 2D array to store character and frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Step 4: Store character and its frequency
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if(freq[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;

                // Set frequency to 0 to avoid duplicates
                freq[ch] = 0;
            }
        }
        return result;
    }

    // Method: Display the result in tabular format
    public static void displayResult(String[][] arr) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("------------------------");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] frequencyResult = findCharacterFrequency(input);
        displayResult(frequencyResult);
    }
}