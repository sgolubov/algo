package ua.com.golubov.algo.educative.string;

import java.util.HashSet;
import java.util.Set;

public class StringSegmentation {

    public static boolean canSegmentString(Set<String> dictionary, String string) {
        return canSegmentStringHelper(dictionary, string, new HashSet<>());
    }

    private static boolean canSegmentStringHelper(Set<String> dictionary, String string, Set<String> solved) {
        for (int i = 1; i < string.length(); i++) {
            String first = string.substring(0, i);
            if (dictionary.contains(first)) {
                String second = string.substring(i);

                if (second.length() == 0 || dictionary.contains(second)) {
                    return true;
                }

                if (!solved.contains(second)) {
                    if (canSegmentStringHelper(dictionary, second, solved)) {
                        return true;
                    }
                    solved.add(second);
                }

            }

        }
        return false;
    }


}
