package ua.com.golubov.algo.educative.arrays;

public class BinarySearchRotated {

    public static int binarySearchRotated(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[start] < arr[mid] && key >= arr[start] && key < arr[mid]) {
                end = mid - 1;
            } else if (arr[mid] < arr[end] && key > arr[mid] && key <= arr[end]) {
                start = mid + 1;
            } else if (arr[start] > arr[mid]) {
                end = mid - 1;
                // if (arr[end] < arr[mid])
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
