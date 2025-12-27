import java.util.Scanner;
public class MetroSmartCardFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 200.0;
        System.out.println("Initial Smart Card Balance : ₹" + balance);

        while(true) {
            if(balance <= 0) {
                System.out.println("Balance exhausted. Please recharge your smart card");
                break;
            }
            System.out.print("\nEnter distance travelled in KM (or -1 to quit) : ");
            double distance = sc.nextDouble();

            // Exit condition
            if(distance == -1) {
                System.out.println("Journey session ended");
                break;
            }

            double fare = (distance <= 5) ? 20.0 : 30.0;

            // Check sufficient balance
            if(fare > balance) {
                System.out.println("Insufficient balance for this trip");
                System.out.println("Current Balance : ₹" + balance);
                break;
            }

            // Deduct fare
            balance -= fare;
            System.out.println("Fare Charged : ₹" + fare);
            System.out.println("Remaining Balance : ₹" + balance);
        }
    }
}