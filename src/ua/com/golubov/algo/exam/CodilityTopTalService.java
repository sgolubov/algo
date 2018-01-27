package ua.com.golubov.algo.exam;

import java.util.HashSet;
import java.util.Set;

public class CodilityTopTalService {

    // correctness 33% performance 55%
    public int solution(Tree T) {
        return countDistinctValuesInTheTree(T, new HashSet<>());
    }

    private int countDistinctValuesInTheTree(Tree T, Set<Integer> distinctValues) {
        int counter = 0;
        if (T != null) {
            if (!distinctValues.contains(T.x)) {
                counter++;
                distinctValues.add(T.x);
            }
            return Math.max(countDistinctValuesInTheTree(T.l, distinctValues), countDistinctValuesInTheTree(T.r, distinctValues)) + counter;
        }
        return counter;
    }

    // correctness 100% performance 0%
    public int solution(String S) {
        Set<String> prefixSet = new HashSet<>();
        Set<String> suffixSet = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            prefixSet.add(S.substring(0, i));
        }

        for (int i = S.length(); i > 0; i--) {
            suffixSet.add(S.substring(i, S.length()));
        }

        int result = 0;

        prefixSet.retainAll(suffixSet);

        for (String s : prefixSet) {
            if (s.length() > result) {
                result = s.length();
            }
        }

        return result;
    }

    // correctness 100% performance 100%
    public int solution(int N) {

        if (N <= 10) {
            return 1;
        }

        String number = N + "";

        char[] num = number.toCharArray();

        char[] charMap = new char[10];

        for (int i = 0; i < number.length(); ++i) {
            charMap[num[i] - '0']++;
        }

        int count = counter(number.length(), charMap);

        if (charMap[0] != 0) {

            charMap[0]--;
            count = count - counter(number.length() - 1, charMap);
        }

        return count;
    }

    private int counter(int length, char[] charMap) {

        long numerator = factorial(length);
        long denominator = 1;
        int numLen = 10;

        for (int i = 0; i < numLen; ++i) {
            if (charMap[i] > 1) {
                denominator *= factorial(charMap[i]);
            }
        }

        long count = numerator / denominator;
        return (int) count;
    }

    private long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; ++i) {
            result *= i;
        }

        return result;
    }

    static class Tree {
        int x;
        Tree l;
        Tree r;
    }


}
