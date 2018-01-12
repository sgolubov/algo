package ua.com.golubov.algo.stepik;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ArrayInversionService {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        AtomicLong counter = new AtomicLong(0);
        mergeSortWithCounter(arr, 0, arr.length - 1, counter);
        System.out.println(counter);
    }

    public static int countInversionsNaive(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    counter++;
            }
        }
        return counter;
    }

    public static int[] mergeSortWithCounter(int[] arr, int l, int r, AtomicLong counter) {
        if (l < r) {
            int m = (l + r) >> 1;
            return merge(mergeSortWithCounter(arr, l, m, counter), mergeSortWithCounter(arr, m + 1, r, counter), counter);
        } else {
            return new int[]{arr[l]};
        }

    }

    private static int[] merge(int[] left, int[] right, AtomicLong counter) {
        int[] res = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                res[k] = left[i];
                i++;
            } else {
                counter.addAndGet(left.length - i);
                res[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            res[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            res[k] = right[j];
            j++;
            k++;
        }
        return res;
    }

}
