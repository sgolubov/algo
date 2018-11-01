package ua.com.golubov.algo.leetcode.array;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContainsDuplicateService {

    public boolean containsDuplicate(int[] nums) {
        return IntStream.of(nums).boxed().collect(Collectors.toSet()).size() != nums.length;
    }

}
