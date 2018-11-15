package ua.com.golubov.algo.graph.test;

import org.junit.Test;
import ua.com.golubov.algo.graph.Dijkstra;

import java.util.HashMap;
import java.util.Map;

class DijkstraTest {

    private static final Map<String, Map<String, Integer>> graph = new HashMap<>() {{
        put("A", new HashMap<>() {{
            put("B", 1);
            put("C", 3);
        }});
        put("B", new HashMap<>() {{
            put("C", 1);
            put("D", 5);
            put("E", 7);
        }});
        put("C", new HashMap<>() {{
            put("D", 3);
            put("E", 9);
            put("F", 20);
        }});
        put("D", new HashMap<>() {{
            put("E", 9);
        }});
        put("E", new HashMap<>() {{
            put("F", 12);
        }});
        put("F", new HashMap<>() {{
            put("A", 12);
        }});
    }};

    @Test
    public void shouldFindShortestPath() {
        Integer path = new Dijkstra<String, Integer>().findShortestPath("A", "F", graph);
    }

}