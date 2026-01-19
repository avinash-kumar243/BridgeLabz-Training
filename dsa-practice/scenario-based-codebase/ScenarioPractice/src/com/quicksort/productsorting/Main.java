package com.quicksort.productsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	// Method to sort products by discount percentage :- Quick Sort
	private static void sortProducts(List<Product> products, int low, int high) {
		if(low < high) {
			int pi = partition(products, low, high);
			
			sortProducts(products, low, pi-1);
			sortProducts(products, pi+1, high);
		}
	}
	private static int partition(List<Product> products, int low, int high) {
		int n = products.size();
		
		int i = low - 1;
		for(int j = low; j < high; j++) {
			if(products.get(j).getDiscountPercentage() > products.get(high).getDiscountPercentage()) {
				i++;
				Product product = products.get(i);
				products.set(i, products.get(j));
				products.set(j, product);
			}
		}
		i++;
		Product product = products.get(i);
		products.set(i, products.get(high));
		products.set(high, product);
		
		return  i; 
	}
	
	
	// Method to display products and discount
	public static void display(List<Product> products) {
		int count = 1;
		for(Product product : products) {
			System.out.println("Product " + count + " -> id: " + product.getProductId() + ", discount percentage: " + product.getDiscountPercentage());
			count++;
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		System.out.println("\n--------------- Product Sorting By Dicount ---------------\n");
		
		
		// 10 products and their discount percentage
		List<Product> products = new ArrayList<>(Arrays.asList(new Product("101", 50), new Product("102", 10), new Product("103", 20), new Product("104", 65), new Product("105", 30), new Product("106", 40),new Product("107", 56), new Product("108", 70), new Product("109", 25), new Product("110", 45)));
		
		System.out.println("\nBefore sorting - Products and their discounts are :- \n");
		display(products);
		
		
		// Sort Products by decreasing discount percentage for each product
		sortProducts(products, 0, products.size()-1);		
		
		
		System.out.println("\nAfter sorting - Products with top discounts are :-\n");
		display(products);
	}
}