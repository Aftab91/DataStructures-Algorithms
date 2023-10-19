package Arrays.easy_problems;

public class best_time_to_buy_and_sell_II {
	
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};

		int profit = maxProfit(prices);

		System.out.println("Maximum Profit: " + profit);
	}

	public static int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				profit += prices[i] - prices[i - 1];
			}
		}
		return profit;
	}
}
