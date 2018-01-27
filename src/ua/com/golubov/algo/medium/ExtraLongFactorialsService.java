package ua.com.golubov.algo.medium;

import java.math.BigInteger;

public class ExtraLongFactorialsService {

    public BigInteger extraLongFactorials(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i < n + 1; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }


}
