package com.questions.functionalinterface.consumer.order;

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		
		// Print order confirmation message using Consumer.
		System.out.println("---------- Printing order confirmation message using Consumer ------------\n");
		
		Consumer<String> orderConformation = msg -> System.out.println(msg);
		
		orderConformation.accept("Order conformed!!!");
	}
}