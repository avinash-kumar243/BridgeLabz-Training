import java.util.Scanner;
public class EligibleForVote {

    // Method to create array of ages for n students
    private static int[] generateAges(int n, Scanner sc) {
        int[] ages = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + " : ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D String array
    private static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for(int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            // Validate age
            if(ages[i] < 0) {
                result[i][1] = "false";
            } else if(ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Method to display 2D array in tabular format
    private static void displayResult(String[][] arr) {
        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfStudents = 10;

        int[] ages = generateAges(numberOfStudents, sc);
        String[][] votingResult = checkVotingEligibility(ages);
        displayResult(votingResult);
    }
}