package ua.com.golubov.algo.stepik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiffSummService {

    public static List<Integer> solve(int n) {
        if (n == 1 || n == 2)
            return Collections.singletonList(n);
        List<Integer> result = new ArrayList<>();
        int c = 1;
        while (c < (int) Math.ceil((double) n / 2)) {
            result.add(c);
            n -= c++;
        }
        result.add(n);
        return result;
    }


}
