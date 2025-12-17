public class CalculateProfitLoss {
	public static void main(String args[]) {
		int costPrice = 129, sellingPrice = 191;
		
		int profit = sellingPrice - costPrice;
		double profitPercent = (double)profit / (costPrice * 100.0);
		
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
	}
}