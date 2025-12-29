/* 8. Shopkeeper’s Discount Dashboard 🛍️
 A shopkeeper gives discounts based on total bill:
 ● Input item prices in a for-loop.
 ● Use if-else for discount logic.
 ● Use proper indentation, constants, and comments.
*/


import java.util.Scanner;
public class ShopkeeperDiscountDashboard {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Giving item price
		int arr[] = new int[4];
		arr[0] = 600;
		arr[1] = 500;
		arr[2] = 800;
		arr[3] = 1000;
		
		System.out.println("----------------------------------------");
		System.out.println("--------------- V - MART ---------------");
		System.out.println("----------------------------------------\n");
				
		boolean need = true;
		double price = 0, discount = 0;
		
		while(need) {
			System.out.println("\n--------------- Choose options ---------------");
			System.out.println("1 - Shirt");
			System.out.println("2 - T-Shirt");
			System.out.println("3 - Pant");
			System.out.println("4 - Bag\n");
			
			int choise = sc.nextInt();
			
			if(choise == 0 || choise >= 5) {
				System.out.println("\nInvalid Choise!!!\n");
				continue;
			}
			
			System.out.print("\nEnter Quantity : ");
			int quantity = sc.nextInt();		
			
			switch(choise) {
				case 1: {
					price += (arr[0] * quantity);
					break;
				}

				case 2: {
					price += (arr[1] * quantity);
					break;
				}
				
				case 3: {
					price += (arr[2] * quantity);
					break;
				}
				
				case 4: {
					price += (arr[3] * quantity);
					break;
				}
				
				default: {
					System.out.println("Invalid Choise!!!");
				}
			}
			
			System.out.println("\nPress 1 for Continue Shopping and 0 for Leave Shopping");
			int option = sc.nextInt();
			
			while(option > 1) {
				System.out.println("\nInvalid Choise!!! \nPress 1 for Continue Shopping and 0 for Leave Shopping");
				option = sc.nextInt();
			}
			if(option == 0) need = false;
		}
		
		if(price > 10000) discount = price * 0.40;
		else if(price > 8000) discount = price * 0.30;
		else if(price > 5000) discount = price * 0.20;
		else if(price > 2000) discount = price * 0.10;
		else discount = 0;
		
		System.out.println("\nPrice is : " + price);
		System.out.println("\nDiscount is : " + discount);
		System.out.println("\nTotal Price to pay : " + (price - discount));
		System.out.println("\nThank You. Have a nice day");
	}
}