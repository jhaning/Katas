package kata.KarateChop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KarateChopTest {

    @Before
    public void setup(){
    }

    @Test
    public void testKarateChop(){
        int numToSearchFor = 3;
        int[] arrayToSearchIn = new int[1];

        KarateChop classUnderTest = new KarateChop();
        assertEquals("Indicator when we don't find the number", -1, classUnderTest.chop(numToSearchFor, arrayToSearchIn));
    }
}
