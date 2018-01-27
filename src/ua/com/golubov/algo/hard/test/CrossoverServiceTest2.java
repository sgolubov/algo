package ua.com.golubov.algo.hard.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.hard.CrossoverService2;

public class CrossoverServiceTest2 {

    @Test
    public void testCase() {
        Assert.assertArrayEquals(new String[]{"Yes", "No"}, CrossoverService2.twins(new String[]{"cdab", "dcba"}, new String[]{"abcd", "abcd"}));


    }

//    @Test
//    public void testCase2() {
//    }
//
//    @Test
//    public void testCase3() {
//    }

}
