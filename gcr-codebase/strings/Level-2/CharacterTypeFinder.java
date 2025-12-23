// Writing a java program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
import java.util.Scanner;
public class CharacterTypeFinder {
	
    // Method to check if character is Vowel, Consonant, or Not a Letter
    public static String checkCharacterType(char ch) {
        // Convert uppercase to lowercase using ASCII values
        if(ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check if character is a letter
        if(ch >= 'a' && ch <= 'z') {
            if(ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to store character and its type in 2D array
    public static String[][] analyzeString(String str) {
        String[][] result = new String[str.length()][2];

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] arr) {
        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String input = sc.nextLine();

        String[][] analysis = analyzeString(input);
        displayTable(analysis);
    }
}