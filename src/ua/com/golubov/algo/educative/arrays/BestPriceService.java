package ua.com.golubov.algo.educative.arrays;

public class BestPriceService {

    public static int findBestIncome(int[] prices) {

        int bestPriceToBuy = prices[0];
        int bestPriceToSell = prices[1];
        int income = bestPriceToSell - bestPriceToBuy;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - bestPriceToBuy > income) {
                bestPriceToSell = prices[i];
                income = bestPriceToSell - bestPriceToBuy;
            }

            if (prices[i] < bestPriceToBuy) {
                bestPriceToBuy = prices[i];
            }
        }

        return income;
    }

}
