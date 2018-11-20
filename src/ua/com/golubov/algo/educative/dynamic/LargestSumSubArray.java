package ua.com.golubov.algo.educative.dynamic;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LargestSumSubArray {

    // find largest sum between identical elements
    // if there is no duplicates return zero
    public static long getLargestSumBetweenIdenticalElements(int[] array) {
        int largestSum = 0;
        Map<Integer, Integer> dictionary = new HashMap<>();
        Map<Integer, Deque<Integer>> pairs = new HashMap<>();

        dictionary.put(array[0], 0);

        // O(n)
        for (int i = 1; i < array.length; i++) {
            Integer dup = dictionary.putIfAbsent(array[i], i);
            if (dup != null) {
                putIntoPairs(array[i], dup, i, pairs);
            }
        }

        // O((n/2)^2)
        for (Deque<Integer> deque : pairs.values()) {
            int currentSum = 0;
            for (int i = deque.getFirst() + 1; i < deque.getLast(); i++) {
                currentSum += array[i];
            }
            if (currentSum > largestSum) {
                largestSum = currentSum;
            }
        }

        return largestSum;
    }

    private static void putIntoPairs(Integer value, Integer prevIndex, Integer newIndex, Map<Integer, Deque<Integer>> pairs) {
        Deque<Integer> indexes = pairs.get(value);
        if (indexes != null) {
            indexes.add(newIndex);
        } else {
            Deque<Integer> idxSet = new LinkedList<>();
            idxSet.add(prevIndex);
            idxSet.add(newIndex);
            pairs.put(value, idxSet);
        }
    }

}
