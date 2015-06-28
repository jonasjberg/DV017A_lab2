/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #2    Uppgift 9 JUnit test
 */

package test;

import static org.junit.Assert.*;
import main.Artikel;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ArtikelTest
{
    private Artikel artikel; 
    private Artikel a1;
    private Artikel a2;
    
    private static final int ARTIKELNR = 1;
    private static final String ARTIKELNAMN = "testartikel";
    private static final int LAGERANTAL = 10;
    private static final double PRIS = 799;

    
    @Before
    public void setUp() throws Exception
    {
        artikel = new Artikel(ARTIKELNR, ARTIKELNAMN, LAGERANTAL, PRIS);
    }

    @After
    public void tearDown() throws Exception
    {
        artikel = null;
        a1 = null;
        a2 = null;
    }

    @Test
    public void testArtikel()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testAndraNamn()
    {
        assertEquals(ARTIKELNAMN, artikel.hamtaNamn());
        artikel.andraNamn("nyttnamn");
        assertEquals("nyttnamn", artikel.hamtaNamn());
    }

    @Test
    public void testHamtaNamn()
    {
        assertEquals(ARTIKELNAMN, artikel.hamtaNamn());
    }

    @Test
    public void testSaljaArtikel()
    {
        int antal = artikel.hamtaTotAntal();
        System.out.println("antal = " + antal);
        artikel.saljaArtikel(1);
        antal--;
        System.out.println("antal = " + antal);
        assertEquals(antal, artikel.hamtaTotAntal());
        artikel.saljaArtikel(2);
        antal =- 2;
        System.out.println("antal = " + antal);
        assertEquals(antal, artikel.hamtaTotAntal());
        artikel.saljaArtikel(100);
        antal = 0;
        System.out.println("antal = " + antal);
        assertEquals(antal, artikel.hamtaTotAntal());
    }

    @Test
    public void testFyllaLagret()
    {
        assertEquals(LAGERANTAL, artikel.hamtaTotAntal());
        artikel.fyllaLagret(1);
        assertEquals(LAGERANTAL + 1, artikel.hamtaTotAntal());
        artikel.fyllaLagret(2);
        assertEquals(LAGERANTAL + 3, artikel.hamtaTotAntal());
        artikel.fyllaLagret(100);
        assertEquals(LAGERANTAL + 103, artikel.hamtaTotAntal());
    }

    @Test
    public void testAndraPris()
    {
        assertEquals(PRIS, artikel.hamtaPris(), Constants.PRECISION);
        artikel.andraPris(999);
        assertEquals(999, artikel.hamtaPris(), Constants.PRECISION);
    }

    @Test
    public void testHamtaPris()
    {
        assertEquals(PRIS, artikel.hamtaPris(), Constants.PRECISION);
    }

    @Test
    public void testHamtaTotAntal()
    {
        a1 = new Artikel(ARTIKELNR, ARTIKELNAMN, LAGERANTAL, PRIS);
        assertEquals(2, artikel.hamtaTotAntal());
        a2 = new Artikel(ARTIKELNR, ARTIKELNAMN, LAGERANTAL, PRIS);
        assertEquals(3, artikel.hamtaTotAntal());
    }

    @Ignore
    @Test
    public void testSkrivInfo()
    {
        assertEquals(true, true);
    }

    @Ignore
    @Test
    public void testPrompt()
    {
        assertEquals(true, true);
    }

}
