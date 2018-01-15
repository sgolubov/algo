package ua.com.golubov.algo.stepik;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSortService {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int MAX_VALUE = 10;
        int[] sorted = countingSort(array, MAX_VALUE);
        Arrays.stream(sorted).forEach(i -> System.out.print(i + " "));
    }

    public static int[] countingSort(int[] theArray, int maxValue) {

        // array of 0's at indices 0...maxValue
        int numCounts[] = new int[maxValue + 1];

        // populate numCounts
        for (int num : theArray) {
            numCounts[num]++;
        }

        // populate the final sorted array
        int[] sortedArray = new int[theArray.length];
        int currentSortedIndex = 0;

        // for each num in numCounts
        for (int num = 0; num < numCounts.length; num++) {
            int count = numCounts[num];

            // for the number of times the item occurs
            for (int i = 0; i < count; i++) {

                // add it to the sorted array
                sortedArray[currentSortedIndex] = num;
                currentSortedIndex++;
            }
        }

        return sortedArray;
    }

}
