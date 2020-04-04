package ua.com.golubov.algo.leetcode.medium.test;

import org.junit.Test;
import ua.com.golubov.algo.leetcode.medium.ValidItinerary;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ValidItineraryTest {

    private ValidItinerary underTest = new ValidItinerary();

    @Test
    public void test1() {
        assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"),
                underTest.findItinerary(List.of(List.of("MUC", "LHR"), List.of("JFK", "MUC"), List.of("SFO", "SJC"),
                        List.of("LHR", "SFO"))));
    }

    @Test
    public void test2() {
        assertEquals(List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"),
                underTest.findItinerary(List.of(List.of("JFK", "SFO"), List.of("JFK", "ATL"), List.of("SFO", "ATL"),
                        List.of("ATL", "JFK"), List.of("ATL", "SFO"))));
    }

    @Test
    public void test3() {
        assertEquals(List.of("JFK", "AXA", "AUA", "ADL", "ANU", "AUA", "ANU", "EZE", "ADL", "EZE", "ANU", "JFK", "AXA",
                "EZE", "TIA", "AUA", "AXA", "TIA", "ADL", "EZE", "HBA"),
                underTest.findItinerary(List.of(List.of("EZE", "TIA"), List.of("EZE", "HBA"), List.of("AXA", "TIA"),
                        List.of("JFK", "AXA"), List.of("ANU", "JFK"), List.of("ADL", "ANU"), List.of("TIA", "AUA"),
                        List.of("ANU", "AUA"), List.of("ADL", "EZE"), List.of("ADL", "EZE"), List.of("EZE", "ADL"),
                        List.of("AXA", "EZE"), List.of("AUA", "AXA"), List.of("JFK", "AXA"), List.of("AXA", "AUA"),
                        List.of("AUA", "ADL"), List.of("ANU", "EZE"), List.of("TIA", "ADL"), List.of("EZE", "ANU"),
                        List.of("AUA", "ANU"))));
    }

    @Test
    public void test4() {
        assertEquals(List.of("JFK", "NRT", "JFK", "KUL"),
                underTest.findItinerary(List.of(List.of("JFK", "KUL"), List.of("JFK", "NRT"), List.of("NRT", "JFK"))));
    }

}
