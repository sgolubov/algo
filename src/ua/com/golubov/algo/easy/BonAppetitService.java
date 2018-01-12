package ua.com.golubov.algo.easy;

import java.util.Arrays;

public class BonAppetitService {

    public static int solve(int n, int k, int b, int[] arr) {
        int sum = Arrays.stream(arr).reduce((a, c) -> a + c).orElse(0);
        int fairSum = sum - arr[k];
        return fairSum / 2 == b ? 0 : b - fairSum / 2;
    }

}
