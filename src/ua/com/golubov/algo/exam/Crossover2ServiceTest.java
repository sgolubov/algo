package ua.com.golubov.algo.exam;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Crossover2ServiceTest {

    @Test
    public void shouldOutputCorrectResult() {
        long result = Crossover2Service.findHowMuchCentsToSpend(4, 12, new long[]{20, 30, 70, 90});
        assertEquals(150, result);
    }

    @Test
    public void shouldOutputCorrectResult2() {
        long result = Crossover2Service.findHowMuchCentsToSpend(4, 3, new long[]{10000, 1000, 100, 10});
        assertEquals(10, result);
    }

    @Test
    public void shouldOutputCorrectResult3() {
        long result = Crossover2Service.findHowMuchCentsToSpend(4, 3, new long[]{10, 100, 1000, 10000});
        assertEquals(30, result);
    }

    @Test
    public void shouldOutputCorrectResult4() {
        long result = Crossover2Service.findHowMuchCentsToSpend(5, 787787787, new long[]{123456789, 234567890, 345678901, 456789012, 987654321});
        assertEquals(44981600785557577L, result);
    }

    @Test
    public void shouldOutputCorrectResult5() {
        long result = Crossover2Service.findHowMuchCentsToSpend(1, 11, new long[]{10});
        assertEquals(110, result);
    }

    @Test
    public void shouldOutputCorrectResult6() {
        long result = Crossover2Service.findHowMuchCentsToSpend(3, 11, new long[]{2, 5, 7});
        assertEquals(20, result);
    }

    @Test
    public void shouldOutputCorrectResult7() {
        long result = Crossover2Service.findHowMuchCentsToSpend(3, 11, new long[]{2, 5, 7});
        assertEquals(20, result);
    }

    @Test
    public void shouldOutputCorrectResult8() {
        long result = Crossover2Service.findHowMuchCentsToSpend(11, 1000, new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        assertEquals(11, result);
    }

}