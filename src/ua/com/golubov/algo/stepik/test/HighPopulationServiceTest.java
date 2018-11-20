package ua.com.golubov.algo.stepik.test;

import org.junit.Test;
import ua.com.golubov.algo.stepik.HighPopulationService;

import static org.junit.Assert.assertEquals;
import static ua.com.golubov.algo.stepik.HighPopulationService.Profile;

public class HighPopulationServiceTest {

    @Test
    public void shouldReturnCorrectYear() {
        Profile[] profiles = new Profile[]{
                new Profile(1810, 1860),
                new Profile(1801, 1853),
                new Profile(1810, 1818),
                new Profile(1840, 1870),
                new Profile(1871, 1890),
                new Profile(1889, 1920),
                new Profile(1911, 1930),
                new Profile(1918, 1940),
                new Profile(1919, 1980),
                new Profile(1930, 1980)
        };
        int result = HighPopulationService.getYearWithHighestPopulation(profiles);
        assertEquals(1919, result);
    }

}