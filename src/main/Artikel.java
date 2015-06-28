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
    
    public Artikel(int artikelnr, String artikelnamn, int lagerantal, double pris)
    {
       this.artikelnr = artikelnr;
       this.artikelnamn = artikelnamn;
       this.lagerantal = lagerantal;
       this.pris = pris;

       totArtiklar++;
    }
    
    public void andraNamn(String artikelnamn)
    {
        if (artikelnamn != null) this.artikelnamn = artikelnamn;
    }
    
    public String hamtaNamn()
    {
        return artikelnamn;
    }
    
    public void saljaArtikel(int antal)
    {
        if (lagerantal - antal > 0) lagerantal -= antal;
    }
    
    public void fyllaLagret(int antal)
    {
        lagerantal += antal;
    }
    
    public void andraPris(double pris)
    {
        if (pris > 0) this.pris = pris;
    }
    
    public double hamtaPris()
    {
        return pris;
    }
    
    public static int hamtaTotAntal()
    {
        return totArtiklar;
    }
    
    public void skrivInfo()
    {
        prompt ("\nArtikelInfo\n-----------"
                + "\nArtikelnummer: " + artikelnr
                + "\nArtikelnamn:   " + artikelnamn
                + "\nLagerantal:    " + lagerantal
                + "\nPris:          " + pris);
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
