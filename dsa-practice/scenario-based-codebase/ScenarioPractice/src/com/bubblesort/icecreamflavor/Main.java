package com.bubblesort.icecreamflavor;

import java.util.Scanner;

public class Main {
	
	// Bubble Sort - on total sells
	public static void sortIcecreamFlavor(Flavor iceCream[]) {
		int n = iceCream.length;
		for(int i=0; i<n-1; i++) {
			boolean isSwap = false;
			
			for(int j=0; j<n-1-i; j++) {
				if(iceCream[j].getQuantitySold() > iceCream[j].getQuantitySold()) {
					// Swap
					Flavor currFlavor = iceCream[j];
					iceCream[j] = iceCream[j+1];
					iceCream[j+1] = currFlavor;
					isSwap = true;
				}
			}
			
			if(!isSwap) break;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Flavor iceCream[] = {new Flavor("Mango", 100), new Flavor("Vanilla", 34), new Flavor("Chocolate", 21), new Flavor("Straw-Berry", 25), new Flavor("Kulfi", 10), new Flavor("Green Tea", 50), new Flavor("Red Velvet", 28), new Flavor("Black Current", 42)};
		
		sortIcecreamFlavor(iceCream);
		
		
		// Print details
		System.out.printf("%-20s %-20s\n","Flavor Name","Sold Count");
		for(Flavor iceCreamFlavor : iceCream) {
			System.out.printf("\n%-20s %-20s",iceCreamFlavor.getFlavorName(),iceCreamFlavor.getQuantitySold());
		}
	}
}