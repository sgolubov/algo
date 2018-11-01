package ua.com.golubov.algo.leetcode.array;

public class RotateArrayService {

    public void rotate(int[] nums, int k) {
        if (nums.length < 2)
            return;

        int optK = k % nums.length;

        int[] shifted = new int[nums.length];

        int currentIndex = 0;

        for (int i = nums.length - optK; i < nums.length; i++) {
            shifted[currentIndex++] = nums[i];
        }

        for (int i = 0; i < nums.length - optK; i++) {
            shifted[currentIndex++] = nums[i];
        }

        System.arraycopy(shifted, 0, nums, 0, nums.length);

    }

}
