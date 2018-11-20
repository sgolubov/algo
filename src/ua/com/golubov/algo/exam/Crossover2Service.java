package ua.com.golubov.algo.exam;

import java.util.PriorityQueue;
import java.util.Queue;

public class Crossover2Service {

    private static final long INIT_BEST_PRICE = -1;

    static long findHowMuchCentsToSpend(int n, int L, long[] c) {
        if (c.length != n) {
            throw new IllegalStateException("Number of products should equal prices array size.");
        }

        Queue<MilkBottle> milkBottles = buildMilkBottleHeap(c);
        return findHowMuchCentsToSpendRec(milkBottles, L, INIT_BEST_PRICE);
    }

    private static long findHowMuchCentsToSpendRec(Queue<MilkBottle> milkBottles, int L, long bestPrice) {
        if (milkBottles.isEmpty()) {
            return bestPrice;
        }

        MilkBottle currentMilkBottle = milkBottles.poll();

        long currentPrice = 0;
        int currentVolume = 0;

        if (L - currentVolume >= currentMilkBottle.volume) {
            int bottlesToBuy = (int) (L / currentMilkBottle.volume);
            currentPrice += currentMilkBottle.price * bottlesToBuy;
            currentVolume += currentMilkBottle.volume * bottlesToBuy;
        }

        if (currentVolume < L) {
            currentPrice += findHowMuchCentsToSpendRec(milkBottles, L - currentVolume, currentMilkBottle.price);
        }

        if (bestPrice == INIT_BEST_PRICE) {
            return currentPrice;
        }
        return Math.min(bestPrice, currentPrice);
    }

    private static Queue<MilkBottle> buildMilkBottleHeap(long[] c) {
        Queue<MilkBottle> milkBottles = new PriorityQueue<>();
        for (int i = 0; i < c.length; i++) {
            double currentVolume = calculateVolume(i);
            double currentVolumePriceRatio = c[i] / currentVolume;
            milkBottles.add(new MilkBottle(c[i], currentVolume, currentVolumePriceRatio));
        }
        return milkBottles;
    }

    private static double calculateVolume(int i) {
        return Math.pow(2, i);
    }

    private static final class MilkBottle implements Comparable<MilkBottle> {
        private final long price;
        private final double volume;
        private final Double volumePriceRatio;

        private MilkBottle(long price, double volume, Double volumePriceRatio) {
            this.price = price;
            this.volume = volume;
            this.volumePriceRatio = volumePriceRatio;
        }

        @Override
        public int compareTo(MilkBottle milkBottle) {
            return volumePriceRatio.compareTo(milkBottle.volumePriceRatio);
        }
    }

}
