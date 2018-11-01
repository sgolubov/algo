package ua.com.golubov.algo.educative.arrays;

public class BinarySearch {

    public static int binSearchIterative(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (key == a[mid]) {
                return mid;
            }

            if (key > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int binSearchRecursive(int[] a, int key) {
        return binSearchRecursiveHelper(a, key, 0, a.length - 1);
    }

    private static int binSearchRecursiveHelper(int[] a, int key, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (key == a[mid]) {
                return mid;
            }

            if (key > a[mid]) {
                return binSearchRecursiveHelper(a, key, mid + 1, high);
            } else {
                return binSearchRecursiveHelper(a, key, low, mid - 1);
            }
        }

        return -1;
    }
}
