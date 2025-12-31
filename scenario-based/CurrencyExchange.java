// 18. Currency Exchange Kiosk 💱
// Design a currency converter:
// ● Take INR amount and target currency.
// ● Use a switch to apply the correct rate.
// ● Ask if the user wants another conversion (do-while).


import java.util.Scanner;
public class CurrencyExchange {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String currency[] = {"United State Doller (USD)", "European Union (EURO)", "Japanese Yen (JPY)", "Russian Rubble (RUB)", "Chinese Yaun (CNY)"};
		double rate[] = {0.011, 0.0095, 1.74, 0.90, 0.078};
		
		boolean conversion = true;
		
		do {
			System.out.print("\n\nEnter INR : ");
			int inr = sc.nextInt();
			
			System.out.println("\n\nChoose either 1, 2, 3, 4, or 5 to convert currency : ");
			for(int i=0; i<currency.length; i++) {
				System.out.println("Press " + (i+1) + " for " + currency[i]);
			}
			
			int choose = sc.nextInt();
			
			switch(choose) {
				case 1 -> System.out.println("\nThe comnversion of " + inr + " INR into USD is : " + (rate[0] * inr));
				case 2 -> System.out.println("\nThe comnversion of " + inr + " INR into EURO is : " + (rate[1] * inr));
				case 3 -> System.out.println("\nThe comnversion of " + inr + " INR into JPY is : " + (rate[2] * inr));
				case 4 -> System.out.println("\nThe comnversion of " + inr + " INR into RUB is : " + (rate[3] * inr));
				case 5 -> System.out.println("\nThe comnversion of " + inr + " INR into CNY is : " + (rate[4] * inr));
				default -> System.out.println("\nInvalid Choise!!!");
			}
			
			System.out.println("\nDO you want again to convert currency? Yes or No.\n");
			String option = sc.next();
			
			if(option.equalsIgnoreCase("no")) conversion = false;
		} while(conversion);
	}
}