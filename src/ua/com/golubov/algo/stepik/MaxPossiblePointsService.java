package ua.com.golubov.algo.stepik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxPossiblePointsService {

    public static List<Integer> solve(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(segment -> segment[1]));
        List<Integer> points = new ArrayList<>(arr.length);
        int currentPoint = -1;
        for (int[] segment : arr) {
            if (currentPoint < segment[0]) {
                points.add(segment[1]);
                currentPoint = segment[1];
            }
        }
        return points;
    }

}
