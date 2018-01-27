package ua.com.golubov.algo.medium;

public class CoinChangeService {

    public long change(int n, int[] c) {
        long[] table = new long[n + 1];

        table[0] = 1;

        for (int coin : c)
            for (int j = coin; j <= n; j++)
                table[j] += table[j - coin];

        return table[n];
    }

}
