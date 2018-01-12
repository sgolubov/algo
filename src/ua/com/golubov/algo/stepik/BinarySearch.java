package ua.com.golubov.algo.stepik;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] sortedArray = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArray[i] = in.nextInt();
        }

        int k = in.nextInt();
        int[] queries = new int[k];
        for (int j = 0; j < k; j++) {
            queries[j] = in.nextInt();
        }

        for (int query : queries) {
            int index = Arrays.binarySearch(sortedArray, query);
            System.out.print((index < 0 ? -1 : index + 1) + " ");
        }

    }

}
