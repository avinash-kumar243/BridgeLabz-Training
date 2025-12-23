Writing a program to split the text into words and return the words along with their lengths in a 2D array
import java.util.Scanner;
public class SplitTextStore2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int length = countLength(str);
        String[] words = extractWord(str, length);
        String[][] result = wordWithLength(words);

        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    // kept method (logic unchanged, compacted)
    public static void compareWords(String[] str1, String[] str2) {
        for(int i = 0; i < str1.length; i++)
            System.out.println(str1[i].equals(str2[i])
                    ? str1[i] + " --equals-- " + str2[i]
                    : str1[i] + " --Not equals-- " + str2[i]);
    }

    public static String[] extractWord(String str, int len) {
        int count = 1;
        for(int i = 0; i < len; i++)
            if (str.charAt(i) == ' ') count++;

        String[] words = new String[count];
        String temp = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') temp += str.charAt(i);
            else { words[index++] = temp; temp = ""; }
        }
        words[index] = temp;
        return words;
    }

    public static int countLength(String str) {
        int count = 0;
        try {
            while (true) str.charAt(count++);
        } catch (Exception e) {}
        return count - 1;
    }

    public static String[][] wordWithLength(String[] words) {
        String[][] data = new String[words.length][2];
        for(int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = "" + countLength(words[i]);
        }
        return data;
    }
}