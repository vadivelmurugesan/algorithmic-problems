package engineer.vel.alogirthms.solutions;

/**
 * 
 * In an array, find a maximum profit you can achieve from the transaction
 * 
 * @author vel
 *
 */
public class BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		int minPrice = 0;
		int lenOfArray = prices.length;
		for (int index = 0; index < lenOfArray; index++) {
			int todaysPrice = prices[index];

			// For the first value, min price is today's stock price
			if (index == 0) {
				minPrice = todaysPrice;
			}
			int todaysProfit = todaysPrice - minPrice;

			// if today's profit is greater than max profit, then update max profit
			if (todaysProfit > maxProfit) {
				maxProfit = todaysProfit;
			}

		}

		return maxProfit;

	}
}