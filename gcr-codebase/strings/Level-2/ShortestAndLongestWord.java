// Writing a program to split the text into words and find the shortest and longest strings in a given text
import java.util.Scanner;
public class ShortestAndLongestWord {
	
    // method to Split text into words using charAt()
    private static String[] splitIntoWords(String text) {
        int count = 0;

		// Finding the size for the word array
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ') {
                count++;
            }
        }
        count++;

        String[] words = new String[count];
        String temp = "";
        int index = 0;

        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if(ch != ' ') {
                temp += ch;
            } else {
                words[index++] = temp;
                temp = "";
            }
        }
        words[index] = temp;
        return words;
    }

    // Method to find string length without using length()
    public static int findLength(String str) {
        int len = 0;
        for(char ch : str.toCharArray()) {
            len++;
        }
        return len;
    }

    // Method to Convert word array into 2D array
    public static String[][] wordWithLength(String[] words) {
        String[][] arr = new String[words.length][2];

        for(int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(len);
        }
        return arr;
    }

    // Method to find shortest and longest word index
    public static int[] findShortestAndLongest(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]);
        int max = Integer.parseInt(arr[0][1]);
        int minIndex = 0, maxIndex = 0;

        for(int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);

            if(len < min) {
                min = len;
                minIndex = i;
            }
            if(len > max) {
                max = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = sc.nextLine();

        String[] words = splitIntoWords(text);
        String[][] wordLengthArr = wordWithLength(words);
        int[] result = findShortestAndLongest(wordLengthArr);

        System.out.println("Shortest Word: " + wordLengthArr[result[0]][0]);
        System.out.println("Longest Word: " + wordLengthArr[result[1]][0]);
    }
}
