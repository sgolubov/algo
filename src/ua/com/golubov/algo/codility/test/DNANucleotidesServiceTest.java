package ua.com.golubov.algo.codility.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.codility.DNANucleotidesService;

public class DNANucleotidesServiceTest {

    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{2, 4, 1}, new DNANucleotidesService().naiveSolution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
        Assert.assertArrayEquals(new int[]{2, 4, 1}, new DNANucleotidesService().solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
    }


}