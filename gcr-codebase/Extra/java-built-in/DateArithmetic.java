import java.time.LocalDate;
import java.util.Scanner;
public class DateArithmetic {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking date input from user
        System.out.print("Enter date (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();

        // Converting String to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Adding 7 days, 1 month, and 2 years
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtracting 3 weeks
        LocalDate finalDate = addedDate.minusWeeks(3);

        // Display results
        System.out.println("Original Date      : " + date);
        System.out.println("After Adding       : " + addedDate);
        System.out.println("Final Date Result  : " + finalDate);
    }
}