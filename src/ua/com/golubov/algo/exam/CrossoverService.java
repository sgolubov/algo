package ua.com.golubov.algo.exam;

import java.util.HashSet;
import java.util.Set;

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

    public static String[] twins(String[] a, String[] b) {
        String[] result = new String[a.length];

        for (int i = 0; i < a.length; i++) {
            Set<Character> even = new HashSet<>();
            Set<Character> odd = new HashSet<>();

            if (a[i].length() != b[i].length()) {
                result[i] = "No";
            }

            for (int j = 0; j < a[i].length(); j++) {
                if (j == 0 || j % 2 == 0) {
                    odd.add(a[i].charAt(j));
                } else {
                    even.add(a[i].charAt(j));
                }
            }

            for (int k = 0; k < b[i].length(); k++) {
                if (k == 0 || k % 2 == 0) {
                    if (!odd.contains(b[i].charAt(k))) {
                        result[i] = "No";
                        break;
                    }
                } else {
                    if (!even.contains(b[i].charAt(k))) {
                        result[i] = "No";
                        break;
                    }
                }
            }

            if (result[i] == null) {
                result[i] = "Yes";
            }

        }

        return result;
    }

}
