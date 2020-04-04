package ua.com.golubov.algo.exam;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class QualtricsService {

    public static List<Integer> itemsSort(List<Integer> items) {
        // Count frequencies
        Map<Integer, Integer> freq = new HashMap<>();
        for (Integer i : items) {
            int count = freq.getOrDefault(i, 0);
            freq.put(i, count + 1);
        }

        // Sort the map
        SortedSet<KeyValuePair> sortedPairs = new TreeSet<>(
                Comparator.comparing(KeyValuePair::getValue)
                        .thenComparing(KeyValuePair::getKey)
        );
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            sortedPairs.add(new KeyValuePair(entry.getKey(), entry.getValue()));
        }

        // Populate the result
        List<Integer> result = new LinkedList<>();
        for (KeyValuePair kV : sortedPairs) {
            for (int i = 0; i < kV.value; i++) {
                result.add(kV.key);
            }
        }

        return result;
    }

    public static long subarraySum(List<Integer> arr) {
        List<Long> arrLong = arr.stream()
                .mapToLong(Long::valueOf)
                .boxed()
                .collect(Collectors.toList());

        long result = 0;

        for (int i = 0; i < arrLong.size(); i++) {
            result += (arrLong.get(i) * (i + 1) * (arrLong.size() - i));
        }

        return result;
    }

    public static long prison(int n, int m, List<Integer> h, List<Integer> v) {
        return findBiggestDiff(n, h) * findBiggestDiff(m, v);
    }

    private static long findBiggestDiff(int n, List<Integer> removals) {
        int prevRemoved = removals.get(0);
        long bestDiff = 1;
        long currentDiff = 1;

        for (int i = 1; i < removals.size(); i++) {
            if (removals.get(i) - prevRemoved == 1) {
                currentDiff++;
            } else {
                if (currentDiff > bestDiff) {
                    bestDiff = currentDiff;
                }
                currentDiff = 1;
            }
            prevRemoved = removals.get(i);
        }
        return bestDiff + 1;
    }

    private static class KeyValuePair {
        private final int key, value;

        private KeyValuePair(int key, int value) {
            super();
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }

}
