package ua.com.golubov.algo.stepik;

import java.util.Arrays;
import java.util.Comparator;

public class KnapSackService {

    public static double solve(double[][] goods, double maxVolume) {
        Arrays.sort(goods, Comparator.comparingDouble(good -> -(good[0] / good[1])));
        double result = 0d;
        double usedVolume = 0;
        int i = 0;
        while (usedVolume < maxVolume && i < goods.length) {
            double[] good = goods[i];
            double possibleValueToAdd = maxVolume - usedVolume;
            if (good[1] <= possibleValueToAdd) {
                usedVolume += good[1];
                result += good[0];
            } else {
                usedVolume += possibleValueToAdd;
                result += good[0] * possibleValueToAdd / good[1];
            }
            i++;
        }
        return result;
    }


}
