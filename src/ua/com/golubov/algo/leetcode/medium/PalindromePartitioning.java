package ua.com.golubov.algo.leetcode.medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new LinkedList<>();

        Deque<String> temp = new LinkedList<>();
        partitionHelper(s, 0, temp, result);

        return result;
    }

    private void partitionHelper(String s, int start, Deque<String> temp, List<List<String>> res) {
        if (start >= s.length() && !temp.isEmpty()) {
            res.add(new ArrayList<>(temp));
            return;
        }

        int end = start;
        while (end < s.length()) {
            if (isPalindrome(s, start, end)) {
                String cur = s.substring(start, end + 1);
                temp.add(cur);
                partitionHelper(s, end + 1, temp, res);
                temp.removeLast();
            }
            end++;
        }
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }


}
