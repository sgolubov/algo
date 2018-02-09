package ua.com.golubov.algo.exam;

import java.math.BigInteger;

public class CodilityNokiaService {

    public int solution(int A, int B, int C) {
        BigInteger value = new BigInteger(A + "");
        BigInteger exponent = new BigInteger(B + "");
        BigInteger modulus = new BigInteger(C + "");
        return value.modPow(exponent, modulus).intValue();
    }

    public int solution(Tree T) {
        return numberOfVisibleNodes(T, Integer.MIN_VALUE);
    }

    private int numberOfVisibleNodes(Tree T, int max) {
        if (T == null) {
            return 0;
        }

        int val = 0;

        if (T.x >= max) {
            max = T.x;
            val = 1;
        }

        return val + numberOfVisibleNodes(T.l, max) + numberOfVisibleNodes(T.r, max);
    }

    public int solution(int N) {
        int largest = N;
        int shift = 0;
        int temp;
        for (int i = 1; i < 30; ++i) {
            temp = (N >>> i | N << (30-i)) & 0x3fffffff;
            if (temp > largest) {
                largest = temp;
                shift = i;
            }
        }
        return shift;
    }

    static class Tree {
        int x;
        Tree l;
        Tree r;
    }

}
