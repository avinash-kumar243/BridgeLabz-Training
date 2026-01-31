package com.streamapi.stockpricelogger;

import java.time.LocalDateTime;

public class Stock {
	private String symbol;
	private double stockPrice;
	private LocalDateTime time;
	
	public Stock(String symbol, double stockPrice, LocalDateTime time) {
		this.symbol = symbol;
		this.stockPrice = stockPrice;
		this.time = time;
	}

	public String getSymbol() {
		return symbol;
	}
	public double getStockPrice() {
		return stockPrice;
	}
	public LocalDateTime getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "Stock [symbol: " + symbol + " || stockPrice=" + stockPrice + " || time: " + time + "]";
	}
}