package ua.com.golubov.algo.educative.dynamic;

public class FibonacciNumbers {

    public static long fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int m = 2;

        long prev1 = 0;
        long prev2 = 1;

        while (m <= n) {
            long tmp = prev1 + prev2;
            prev1 = prev2;
            prev2 = tmp;
            m++;
        }

        return prev2;
    }

    private static long fibRec(int n, long[] memo) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fibRec(n - 1, memo) + fibRec(n - 2, memo);
        return memo[n];
    }


}
