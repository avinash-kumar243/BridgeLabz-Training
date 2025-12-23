import java.util.Scanner;
public class CharacterFrequencyUsingUnique {

    // Method 1: Find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        for(char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method 2: Find unique characters using nested loops and charAt()
    public static char[] uniqueCharacters(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for(int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for(int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                temp[uniqueCount++] = current;
            }
        }
        char[] result = new char[uniqueCount];
        for(int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    // Method 3: Find frequency using unique characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for(int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }
        return result;
    }

    // Method 4: Display result in tabular format
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

        String[][] frequencyResult = findFrequency(input);
        displayResult(frequencyResult);
    }
}