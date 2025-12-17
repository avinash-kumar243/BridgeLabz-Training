// Writing a java program to calculate profit and profit percent
public class CalculateProfitLoss {
	public static void main(String args[]) {
		// Giving sell price and cost price
		int costPrice = 129, sellingPrice = 191;
		
		// calculating profit and percent profit
		int profit = sellingPrice - costPrice;
		double profitPercent = (double)profit / (double)costPrice * 100.0;
		
		// Displaying cost price, sell price, profit, and percent profit
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
	}
}