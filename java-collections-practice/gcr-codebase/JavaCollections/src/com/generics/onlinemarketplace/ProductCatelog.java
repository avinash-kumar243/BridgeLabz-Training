package com.generics.onlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatelog {
	private List<Product<?>> products = new ArrayList<>();
	
	public void addProduct(Product <?> product) {
		products.add(product);
	}
	
	public void showProducts() {
		for(Product<?> product : products) {
			System.out.println(product.getDetails());
		}
	}
}