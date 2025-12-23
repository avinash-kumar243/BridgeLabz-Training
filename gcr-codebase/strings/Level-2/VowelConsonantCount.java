// Writing a java program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
import java.util.Scanner;
public class VowelConsonantCount {

    // Method to check if character is Vowel, Consonant, or Not a Letter
    private static String checkCharacter(char ch) {
        // Convert uppercase to lowercase using ASCII values
        if(ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
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

    // Method to count vowels and consonants using charAt()
    private static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharacter(ch);

            if(result.equals("Vowel")) {
                vowels++;
            } else if(result.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");
        String input = sc.nextLine();

        int[] result = countVowelsAndConsonants(input);

        System.out.println("Number of Vowels : " + result[0]);
        System.out.println("Number of Consonants : " + result[1]);
    }
}