package ua.com.golubov.algo.leetcode.medium;

import java.util.Collections;
import java.util.List;

public class NumOfBurgers {

    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if (tomatoSlices % 2 != 0) {
            return Collections.emptyList();
        }

        int minTomatoSlices = cheeseSlices * 2;
        if (minTomatoSlices > tomatoSlices) {
            return Collections.emptyList();
        }

        if (minTomatoSlices == tomatoSlices) {
            return List.of(0, cheeseSlices);
        }

        int remainingTomatoSlices = tomatoSlices;
        int remainingCheeseSlices = cheeseSlices;
        int jumboBurgerCounter = 0;

        while (remainingTomatoSlices > remainingCheeseSlices * 2
                && remainingCheeseSlices > 0 && remainingTomatoSlices > 0) {
            remainingTomatoSlices -= 4;
            remainingCheeseSlices--;
            jumboBurgerCounter++;
        }

        if (remainingCheeseSlices * 2 == remainingTomatoSlices) {
            return List.of(jumboBurgerCounter, remainingCheeseSlices);
        }

        return Collections.emptyList();
    }


}
