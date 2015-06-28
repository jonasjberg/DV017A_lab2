/**
 *  DV017A :: Grundläggande programmering i Java
 *  860224 Jonas Sjöberg
 *  Högskolan i Gävle
 *  tel12jsg@student.hig.se
 *
 *  Labb #2    Uppgift 9
 */

package main;

public class Artikel
{
    private static int totArtiklar = 0;

    private int artikelnr;
    private String artikelnamn;
    private int lagerantal;
    private double pris;

    /**
     * Klass 'Artikel' representerar ett artikelslag.
     * @param artikelnr         artikelns artikelnummer
     * @param artikelnamn       artikelns namn
     * @param lagerantal        antal i lager
     * @param pris              artikelns pris
     */
    public Artikel(int artikelnr, String artikelnamn, int lagerantal, double pris)
    {
       this.artikelnr = artikelnr;
       this.artikelnamn = artikelnamn;
       this.lagerantal = lagerantal;
       this.pris = pris;

       totArtiklar++;
    }

    /**
     * Ändra artikelns namn.
     * @param artikelnamn   nytt namn
     */
    public void andraNamn(String artikelnamn)
    {
        if (artikelnamn != null) this.artikelnamn = artikelnamn;
    }

    /**
     * Hämta artikelns namn.
     * @return      artikelns namn
     */
    public String hamtaNamn()
    {
        return artikelnamn;
    }

    /**
     * Sälj 'antal' exemplar av artikel och minska lagerantalet.
     * @param antal     antal artiklar att sälja
     */
    public void saljaArtikel(int antal)
    {
        if (lagerantal - antal > 0) lagerantal -= antal;
    }

    /**
     * Fyller lagret med 'antal' exemplar av artikeln.
     * @param antal     antal artiklar som placeras i lagret
     */
    public void fyllaLagret(int antal)
    {
        lagerantal += antal;
    }

    /**
     * Ändrar artikelns pris.
     * @param pris      artikelns nya pris
     */
    public void andraPris(double pris)
    {
        if (pris > 0) this.pris = pris;
    }

    /**
     * Hämtar artikelns pris.
     * @return      artikelns pris
     */
    public double hamtaPris()
    {
        return pris;
    }

    /**
     * Hämtar totalt antal artiklar.
     * @return      totalt antal artiklar
     */
    public static int hamtaTotAntal()
    {
        return totArtiklar;
    }

    /**
     * Skriver ut information om artikeln likt toString().
     */
    public void skrivInfo()
    {
        prompt ("\nArtikelInfo\n-----------"
                + "\nArtikelnummer: " + artikelnr
                + "\nArtikelnamn:   " + artikelnamn
                + "\nLagerantal:    " + lagerantal
                + "\nPris:          " + pris + "\n");
    }

    /**
     * Wrapper runt System.out.println() för mindre skrivande.
     * @param s     textsträng att skriva ut
     */
    public static void prompt(String s)
    {
        System.out.println(s);
    }
}
