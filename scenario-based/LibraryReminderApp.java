/* 15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class LibraryReminderApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int finePerDay = 5;

        System.out.println("\n----------------------------------------------------------------");
        System.out.println("------------------ Rohan’s Library Reminder App ------------------");
        System.out.println("------------------------------------------------------------------\n");

        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        int currentMonth = today.getMonthValue();

        for(int i = 1; i <= 5; i++) {
            System.out.println("Book " + i + " : Enter Due Date");
            LocalDate dueDate = LocalDate.parse(sc.next());

            // Validate due date (must be in current month, days 1–30)
            while(dueDate.getYear() != currentYear ||
                    dueDate.getMonthValue() != currentMonth ||
                    dueDate.getDayOfMonth() < 1 ||
                    dueDate.getDayOfMonth() > 30) {

                System.out.println("Invalid date. Enter a date within the current month : ");
                dueDate = LocalDate.parse(sc.next());
            }

            System.out.println("Book " + i + ": Enter Return Date (yyyy-mm-dd)");
            LocalDate returnDate = LocalDate.parse(sc.next());

            // Validate return date (must be in current month, days 1–30)
            while(returnDate.getYear() != currentYear ||
                    returnDate.getMonthValue() != currentMonth ||
                    returnDate.getDayOfMonth() < 1 ||
                    returnDate.getDayOfMonth() > 30) {

                System.out.println("Invalid date. Enter a date within the current month (1–30):");
                returnDate = LocalDate.parse(sc.next());
            }

            long delayDays = ChronoUnit.DAYS.between(dueDate, returnDate);

            if(delayDays > 0) {
                long fine = delayDays * finePerDay;
                System.out.println("Result : returned " + delayDays + " days late fine = " + fine);
            } else {
                System.out.println("Result : returned on time no fine");
            }
            System.out.println("---------------------------------------------------------------\n");
        }
        System.out.println("Processing completed for all 5 books");
    }
}