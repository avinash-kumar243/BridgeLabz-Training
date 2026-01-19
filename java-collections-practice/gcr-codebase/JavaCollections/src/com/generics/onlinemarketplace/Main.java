package com.generics.onlinemarketplace;

public class Main {
	public static void main(String[] args) {
		Product<BookCategory> book = new Product<>("Java", 500, new BookCategory());
				
		Product<ClothingCategory> shirt = new Product<>("T-Shirt", 1000, new ClothingCategory());
		
		Product<GadgetCategory> phone = new Product<>("Smartphone", 10000, new GadgetCategory());
		
		
		ProductCatelog catelog = new ProductCatelog();
		
		
		catelog.addProduct(book);
		catelog.addProduct(shirt);
		catelog.addProduct(phone);
		
		DiscountService.applyDiscount(book, 10);
		DiscountService.applyDiscount(phone, 5);
		
		catelog.showProducts();
	}
}