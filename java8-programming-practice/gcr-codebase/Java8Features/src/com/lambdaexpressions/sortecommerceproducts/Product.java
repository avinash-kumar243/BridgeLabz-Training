package com.lambdaexpressions.sortecommerceproducts;

public class Product {
	private int productId;
	private double rating;
	private double price;
	private int discount;
	
	public Product(int productId, double rating, double price, int discount) {
		this.productId = productId;
		this.rating = rating;
		this.price = price;
		this.discount = discount;
	}

	
	public int getProductId() {
		return productId;
	}
	public double getPrice() {
		return price;
	}
	public double getRating() {
		return rating; 
	}
	public int getDiscount() {
		return discount;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", product rating=" + rating + ", price=" + price + ", discount="
				+ discount + "]";
	}
}