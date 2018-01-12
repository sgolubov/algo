package ua.com.golubov.algo.stepik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class QuickSortService {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] segments = new int[n][2];
        for (int i = 0; i < n; i++) {
            segments[i][0] = in.nextInt();
            segments[i][1] = in.nextInt();
        }
        int[] points = new int[m];
        for (int j = 0; j < n; j++) {
            points[j] = in.nextInt();
        }
        int[] result = countPointIntersection(segments, points);
        for (int matchPoint : result) {
            System.out.print(matchPoint + " ");
        }
    }

    public static int[] countPointIntersection(int[][] segments, int[] points) {
        Set<Integer> result = new HashSet<>();
        Arrays.sort(segments, Comparator.comparingInt(arr -> arr[1]));




        Arrays.sort(segments, Comparator.comparingInt(arr -> arr[0]));





        return new int[0];
    }

}
