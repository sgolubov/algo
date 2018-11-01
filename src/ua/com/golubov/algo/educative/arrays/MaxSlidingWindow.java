package ua.com.golubov.algo.educative.arrays;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxSlidingWindow {

    public static List<Integer> findMaxSlidingWindow(int[] array, int windowSize) {
        if (windowSize == 1) {
            return IntStream.of(array)
                    .boxed()
                    .collect(Collectors.toList());
        }

        if (array == null || array.length == 0 || windowSize <= 0) {
            return Collections.emptyList();
        }

        List<Integer> result = new LinkedList<>();

        Deque<Integer> window = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            while (!window.isEmpty() && array[window.getLast()] <= array[i]) {
                window.removeLast();
            }
            window.addLast(i);
            if (i >= windowSize - 1) {
                window.remove(i - windowSize);
                result.add(array[window.getFirst()]);
            }
        }

        return result;
    }

}
