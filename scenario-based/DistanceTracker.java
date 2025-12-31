// 19. Bus Route Distance Tracker 🚌
// Each stop adds distance.
// ● Ask if the passenger wants to get off at a stop.
// ● Use a while-loop with a total distance tracker.
// ● Exit on user confirmation.

import java.util.Scanner;
public class DistanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        int distancePerStop = 5;   // assume each stop adds 5 km
        String choice;

        System.out.println("\n------------------ Bus Route Distance Tracker ------------------\n");
        System.out.println("Each stop adds " + distancePerStop + " km to your journey\n");

        while(true) {
            System.out.print("Do you want to continue to the next stop? (yes/no): ");
            choice = sc.next().toLowerCase();

            if(choice.equals("yes")) {
                totalDistance += distancePerStop;
            } else if(choice.equals("no")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter yes or no.\n");
            }
        }
        System.out.println("\nYou travelled a total distance of: " + totalDistance + " km");
    }
}