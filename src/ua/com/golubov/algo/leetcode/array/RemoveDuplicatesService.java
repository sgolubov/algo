package ua.com.golubov.algo.leetcode.array;

public class RemoveDuplicatesService {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int insertIndex = 0;
        int previousValue = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != previousValue) {
                previousValue = nums[i];
                nums[insertIndex++] = nums[i];
            }
        }
        return insertIndex;
    }

}
