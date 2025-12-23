import java.util.Scanner;
public class CharacterFrequencyUnique {

    // Method 1: Find unique characters using nested loops and charAt()
    public static char[] uniqueCharacters(String text) {

        int len = text.length();
        char[] temp = new char[len];
        int count = 0;

        for(int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for(int j = 0; j < i; j++) {
                if(current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[count++] = current;
            }
        }

        // Create exact-sized array
        char[] uniqueChars = new char[count];
        for(int i = 0; i < count; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    // Method 2: Find frequency using unique characters
    public static String[][] findFrequency(String text) {

        // ASCII frequency array
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        char[] uniqueChars = uniqueCharacters(text);

        String[][] result = new String[uniqueChars.length][2];

        // Store character and its frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }
        return result;
    }

    // Method 3: Display result
    public static void displayResult(String[][] arr) {

        System.out.println("\nCharacter\tFrequency");
        System.out.println("------------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);
        displayResult(result);
    }
}