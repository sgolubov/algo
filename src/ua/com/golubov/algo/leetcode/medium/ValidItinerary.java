package ua.com.golubov.algo.leetcode.medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class ValidItinerary {

    private static final String ORIGIN = "JFK";

    private List<String> result = null;

    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, List<String>> fromToMap = tickets.stream()
                .collect(Collectors.groupingBy(l -> l.get(0), mapping(l -> l.get(1), toList())));

        Map<String, List<Boolean>> visited = new HashMap<>();

        fromToMap.forEach((key, value) -> {
            value.sort(String::compareTo);
            List<Boolean> visitedList = new ArrayList<>();
            for (int i = 0; i < value.size(); i++) {
                visitedList.add(false);
            }
            visited.put(key, visitedList);
        });

        Deque<String> result = new LinkedList<>();
        result.add(ORIGIN);

        backTracking(ORIGIN, result, visited, fromToMap, tickets.size());

        return this.result;
    }

    private boolean backTracking(String origin, Deque<String> result, Map<String, List<Boolean>> visited,
                                 Map<String, List<String>> fromToMap, int tickets) {
        if (result.size() == tickets + 1) {
            this.result = new ArrayList<>(result);
            return true;
        }

        if (!fromToMap.containsKey(origin)) {
            return false;
        }

        List<String> toList = fromToMap.get(origin);
        List<Boolean> visitedList = visited.get(origin);

        for (int i = 0; i < toList.size(); i++) {
            if (!visitedList.get(i)) {
                String nextOrigin = toList.get(i);
                visitedList.set(i, true);
                result.addLast(nextOrigin);

                boolean res = backTracking(nextOrigin, result, visited, fromToMap, tickets);

                result.removeLast();
                visitedList.set(i, false);

                if (res) {
                    return true;
                }
            }
        }

        return false;
    }


}
