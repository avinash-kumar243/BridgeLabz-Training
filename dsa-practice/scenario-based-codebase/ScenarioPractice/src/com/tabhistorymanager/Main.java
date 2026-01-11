package com.tabhistorymanager;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Browser browser = new Browser();
		
		while(true) {
			System.out.println("\n\n-------------------Tab History Manager-------------------\n");
			System.out.println("Enter 1 to view all opened tabs");
			System.out.println("Enter 2 to view all closed tabs");
			System.out.println("Enter 3 to open a new tab");
			System.out.println("Enter 4 to close a tab");
			System.out.println("Enter 5 to exit");
			
			if(!sc.hasNextInt()) {
				System.out.println("Invalid input. Please enter a valid number from 1 to 5");
				sc.nextLine();
				continue;
			}
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 5) {
				System.out.println("\nThanku. Have a nice day\n");
				break;
			}
			
			String tabId;
			
			switch(choice) {
				case 1:
					browser.viewOpenedTabs();
					break;
					
				case 2: 
					browser.viewClosedTabs();
					break;
				
				case 3:
					System.out.print("\nPlease enter a new tab id (String): ");
					tabId = sc.nextLine();
					browser.openTab(new Tab(tabId));
					break;
					
				case 4:
					System.out.print("\nPlease enter a tab id to close a tab (String): ");
					tabId = sc.nextLine();
					browser.closeTab(tabId);
					break;
					
				default:
					System.out.println("Invalid choice!");
			}
		}
	}
}