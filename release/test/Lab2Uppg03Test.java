/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #2    Uppgift 3 JUnit test
 */

package test;

import main.Lab2Uppg03;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class Lab2Uppg03Test
{
    private int TEST_DATA[];        // Uppsättning siffror att använda vid test
    private int expected;           // "Rätt svar"
    private int actual;             // Faktiskt svar vid testkörning
    private Lab2Uppg03 uppg03;      // Objekt under test

    @Before
    public void setUp() throws Exception
    {
        uppg03 = new Lab2Uppg03();
    }

    @After
    public void tearDown() throws Exception
    {
        uppg03 = null;
    }

    /* Varje parameter placeras som argument här. När en runner körs så skickar
     * den argumenten från parametrar definierade i testData()-metoden. */
    public Lab2Uppg03Test(int[] TEST_DATA, int expected) {
        this.TEST_DATA = TEST_DATA;
        this.expected = expected;
        System.out.println("expected = " + expected);
    }

    /* Testdata på formen:
     *          { new int[] { 1, 3, 2 }, 2 }
     *                        |  |  |    |
     *                        |  |  |    +--- rätt svar
     *                        +--+--+-------- skickas till metoden under test
     */
//  @formatter:off
    @Parameterized.Parameters
    public static Collection<Object[]> testData()
    {
        return Arrays.asList(new Object[][] {
                { new int[] { 1  , 2   , 3    } , 2   }   ,
                { new int[] { 3  , 2   , 1    } , 2   }   ,
                { new int[] { 2  , 3   , 1    } , 2   }   ,
                { new int[] { 1  , 3   , 2    } , 2   }   ,
                { new int[] { 10 , 10  , 20   } , 10  }   ,
                { new int[] { 11 , 12  , 13   } , 12  }   ,
                { new int[] { 13 , 12  , 1000 } , 13  }   ,
                { new int[] { 1  , 101 , 1002 } , 101 }   ,
                { new int[] { 1  , 1   , 1    } , 1   }   ,
                { new int[] { 1  , 0   , 0    } , 0   }   ,
                { new int[] { 0  , 0   , 0    } , 0   } });
    }
//  @formatter:on
    @Test
    public void testMellerstaTalet()
    {
        actual = uppg03.mellerstaTalet(TEST_DATA);
        System.out.println("actual = " + actual);
        assertEquals(expected, actual);
    }
}
