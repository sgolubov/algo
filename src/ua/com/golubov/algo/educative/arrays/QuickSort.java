package ua.com.golubov.algo.educative.arrays;

public class QuickSort {

    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }

    private static void quickSortHelper(int[] array, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int pivot = partition(array, begin, end);
        quickSortHelper(array, begin, pivot);
        quickSortHelper(array, pivot + 1, end);
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = array[begin];
        int i = begin;
        int j = end;
        while (i < j) {
            while (i <= end && array[i] <= pivot) i++;
            while (array[j] > pivot) j--;

            if (i < j) {
                swap(array, i, j);
            }
        }
        array[begin] = array[j];
        array[j] = pivot;
        return j;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
