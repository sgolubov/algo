package ua.com.golubov.algo.exam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class BnyService {

    public static int minDiff(List<Integer> arr) {
        List<Integer> nums = arr.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        int diffSum = 0;
        int prev = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            int element = nums.get(i);
            diffSum += element - prev;
            prev = element;
        }
        return diffSum;
    }

    public static int fewestCoins(String coins) {
        Set<Character> idx = new HashSet<>();
        for (Character character : coins.toCharArray()) {
            idx.add(character);
        }

        int bestSize = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length(); i++) {
            Set<Character> searchIdx = new HashSet<>();
            int currSize = 0;
            for (int j = i; j < coins.length(); j++) {
                searchIdx.add(coins.charAt(j));
                currSize++;
                if (searchIdx.size() == idx.size()) {
                    if (currSize < bestSize) {
                        bestSize = currSize;
                        currSize = 0;
                        searchIdx.clear();
                    }
                }
            }
        }

        return bestSize;
    }

    public static List<Integer> balancedOrNot(List<String> expressions, List<Integer> maxReplacements) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expressions.size(); i++) {
            result.add(isBalanced(expressions.get(i), maxReplacements.get(i)));
        }
        return result;
    }

    private static int isBalanced(String in, int maxReplacement) {
        Stack<Character> st = new Stack<>();
        for (char chr : in.toCharArray()) {
            switch (chr) {
                case '<':
                    st.push(chr);
                    break;
                case '>':
                    if ((st.isEmpty() || st.pop() != '<') && --maxReplacement < 0) {
                        return 0;
                    }
                    break;
                default:
                    throw new IllegalStateException("Illegal character.");
            }
        }
        return st.isEmpty() ? 1 : 0;
    }

}
