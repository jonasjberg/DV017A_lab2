/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #2    Uppgift 4 JUnit test
 */

package test;

import main.Lab2Uppg04;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.Ignore;

@RunWith(Parameterized.class)
public class Lab2Uppg04Test
{
    private int range_min;        
    private int range_max;        
    private int expected;           // "Rätt svar"
    private int actual;             // Faktiskt svar vid testkörning
    private Lab2Uppg04 uppg04;      // Objekt under test

    @Before
    public void setUp() throws Exception
    {
        uppg04 = new Lab2Uppg04();
    }

    @After
    public void tearDown() throws Exception
    {
        uppg04 = null;
    }
    
    /* Varje parameter placeras som argument här. När en runner körs så skickar
     * den argumenten från parametrar definierade i testData()-metoden. */
    public Lab2Uppg04Test(int range_min, int range_max) {
        this.range_min = range_min;
        this.range_max = range_max;
    }

//  @formatter:off
    @Parameterized.Parameters
    public static Collection<Object[]> testData()
    {
        return Arrays.asList(new Object[][] {
                { 0, 0  },
                { 0, 1  },
                { 0, 10  },
                { 0, 100  },
                { 1, 2  }, 
                { 1, 10 }, 
                { 1, 100 }, 
                { 1, 1001 }
        });
    }
//  @formatter:on

    @Test
    public void testGetRandomNumber()
    {
        for (int i = 0; i < 100; i++) {
            int r = uppg04.getRandomNumber(range_min, range_max);
            assertTrue("Slumptal måste vara större än " + range_min + "  men är " + r, r >= range_min);
            assertTrue("Slumptal måste vara mindre än " + range_max + "  men är " + r, r <= range_max);
        }
    }
    
    @Ignore
    @Test
    public void testCheckGuess()
    {
        fail("Not yet implemented");
    }

    @Ignore
    @Test
    public void testKeepPlaying()
    {
        fail("Not yet implemented");
    }

    @Ignore
    @Test
    public void testResetGame()
    {
        fail("Not yet implemented");
    }

}
