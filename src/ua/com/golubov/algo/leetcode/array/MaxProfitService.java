package ua.com.golubov.algo.leetcode.array;

public class MaxProfitService {

    public int maxProfit(int[] prices) {
        if (prices.length < 2)
            return 0;
        int profit = 0;
        int priceWePayed = prices[0];
        int goodPrice = priceWePayed;

        for (int i = 1; i < prices.length; i++) {
            if (goodPrice < prices[i]) {
                goodPrice = prices[i];
                if (i == prices.length - 1) {
                    profit += goodPrice - priceWePayed;
                }
            } else {
                profit += goodPrice - priceWePayed;
                priceWePayed = prices[i];
                goodPrice = priceWePayed;
            }
        }

        return profit;
    }

}
