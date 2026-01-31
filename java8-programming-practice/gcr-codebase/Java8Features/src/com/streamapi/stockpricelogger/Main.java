package com.streamapi.stockpricelogger;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Stock> stocks = List.of(new Stock("101", 1000, LocalDateTime.now()),
									 new Stock("102", 2000, LocalDateTime.now()),
									 new Stock("103", 3500, LocalDateTime.now()),
									 new Stock("104", 1500, LocalDateTime.now()),
									 new Stock("105", 5200, LocalDateTime.now()),
									 new Stock("106", 4400, LocalDateTime.now()),
									 new Stock("107", 8000, LocalDateTime.now()),
									 new Stock("108", 6000, LocalDateTime.now()));
		
		System.out.println("All stocks price from a live feed are :- ");
		
		stocks.stream()
			  .forEach(stock -> System.out.println(stock.getSymbol() + " -> " + stock.getStockPrice()));
	}
}