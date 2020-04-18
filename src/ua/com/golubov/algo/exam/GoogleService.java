package ua.com.golubov.algo.exam;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class GoogleService {

    void f(Object data, Consumer<Object> success, Consumer<Object> failure) {

    }


    void retryF(Object data, int maxTries, Consumer<Object> success, Consumer<Object> failure) {
        f(data, success, __ -> {
            if (maxTries <= 0) {
                failure.accept(new Object());
            }

            retryF(data, maxTries - 1, success, failure);
        });
    }

    public List<List<String>> groupForEncoding(List<String> words) {

        Map<String, List<String>> index = new HashMap<>();

        for (String word : words) {
            String keyString = createTheKey(word);
            List<String> bucket = index.getOrDefault(keyString, new LinkedList<>());
            index.putIfAbsent(keyString, bucket);
            bucket.add(word);
        }

        List<List<String>> result = new LinkedList<>();

        for (Map.Entry<String, List<String>> entry : index.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

    private String createTheKey(String word) {
        StringBuilder keyBuilder = new StringBuilder();
        keyBuilder.append("0-");

        char[] charArray = word.toCharArray();

        int firstChar = charArray[0];
        int lowerBoundary = 'a';
        int upperBoundary = 'z';
        int diff = firstChar - lowerBoundary;

        for (int i = 1; i < charArray.length; i++) {

            if (charArray[i] >= firstChar) {
                keyBuilder.append(Math.min(charArray[i] - firstChar, (upperBoundary - charArray[i] + diff)));
            } else {
                keyBuilder.append((charArray[i] + diff + 1) - firstChar);
            }

            keyBuilder.append("-");

        }

        return keyBuilder.toString();
    }

}
