package ua.com.golubov.algo.medium.test;

import org.junit.Test;
import ua.com.golubov.algo.medium.ExtraLongFactorialsService;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class ExtraLongFactorialsServiceTest {

    @Test
    public void testExtraLongFactorials() {
        assertEquals(new BigInteger("15511210043330985984000000"), new ExtraLongFactorialsService().extraLongFactorials(25));
    }

    @Test
    public void testExtraLongFactorialsOne() {
        assertEquals(new BigInteger("1"), new ExtraLongFactorialsService().extraLongFactorials(1));
    }

}