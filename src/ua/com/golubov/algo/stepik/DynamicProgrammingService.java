package ua.com.golubov.algo.stepik;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class DynamicProgrammingService {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        OptionalInt k = lisBottomUp(arr);
        if (k.isPresent()) {
            System.out.println(k.getAsInt());
        }
    }

    public static OptionalInt lisBottomUp(int[] arr) {
        int[] counter = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            counter[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0 && counter[j] + 1 > counter[i]) {
                    counter[i] = counter[j] + 1;
                }
            }
        }

        return Arrays.stream(counter).max();
    }


}
