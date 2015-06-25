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
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Lab2Uppg03Test
{
    private static int OSORTERADE_TAL[];
    Lab2Uppg03  uppg03;
    
    @Before
    public void setUp() throws Exception
    {
        OSORTERADE_TAL = new int[3];
        OSORTERADE_TAL[0] = 47;
        OSORTERADE_TAL[1] = 89;
        OSORTERADE_TAL[2] = 3;
        uppg03 = new Lab2Uppg03();
    }

    @After
    public void tearDown() throws Exception
    {
        uppg03 = null;
    }

    @Test
    public void testMellerstaTalet()
    {
        assertEquals(47, uppg03.mellerstaTalet(OSORTERADE_TAL));
    }

}
