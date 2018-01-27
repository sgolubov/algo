package ua.com.golubov.algo.hard;

public class CrossoverService {

    // use stack instead
    public static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
        int[] result = new int[expressions.length];

        for (int i = 0; i < expressions.length; i++) {
            int counter = 0;
            boolean isOpenedAtTheEnd = false;
            for (char c : expressions[i].toCharArray()) {
                if (c == '<') {
                    counter++;
                    isOpenedAtTheEnd = true;
                } else {
                    counter--;
                    isOpenedAtTheEnd = false;
                }
            }

            if (Math.abs(counter) <= maxReplacements[i] && !isOpenedAtTheEnd) {
                result[i] = 1;
            }

        }

        return result;
    }


}
