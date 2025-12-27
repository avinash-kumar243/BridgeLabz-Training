import java.util.Scanner;
public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;

        while (true) {
            System.out.print("Enter age of voter (or enter -1 to exit) : ");
            int age = sc.nextInt();

            // Exit condition
            if(age < 0) {
                System.out.println("Voting session ended");
                break;
            }

            // Eligibility check
            if(age < 18) {
                System.out.println("Not eligible to vote (Age must be 18 or above)");
                continue;
            }

            // Accept vote
            System.out.println("Enter your vote :");
            System.out.println("1 - Candidate A");
            System.out.println("2 - Candidate B");
            System.out.println("3 - Candidate C");
            System.out.print("Your choice : ");

            int vote = sc.nextInt();
            if(vote == 1) {
                candidate1++;
                System.out.println("Vote recorded for Candidate A");
            } else if (vote == 2) {
                candidate2++;
                System.out.println("Vote recorded for Candidate B");
            } else if (vote == 3) {
                candidate3++;
                System.out.println("Vote recorded for Candidate C");
            } else {
                System.out.println("Invalid vote choice. Please enter 1, 2, or 3 \n");
            }
        }

        // Display final results
        System.out.println("Final Vote Count:");
        System.out.println("Candidate A : " + candidate1);
        System.out.println("Candidate B : " + candidate2);
        System.out.println("Candidate C : " + candidate3);
    }
}