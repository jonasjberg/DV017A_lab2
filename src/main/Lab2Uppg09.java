/**
 *  DV017A :: Grundläggande programmering i Java
 *  860224 Jonas Sjöberg
 *  Högskolan i Gävle
 *  tel12jsg@student.hig.se
 *
 *  Labb #2    Uppgift 9
 */

package main;

public class Lab2Uppg09
{
    public static void main(String[] args)
    {
        UserInputFilter filter = new UserInputFilter();
        Artikel a1 = createNewArtikel(); 
        Artikel a2 = createNewArtikel(); 
       
        a1.skrivInfo();
        a2.skrivInfo();
       
        prompt("\n* Ändrar artikeln 'a1's namn ..");
        a1.andraNamn(filter.getString("Ange nytt artikelnamn: "));
        prompt("Artikeln 'a1' har nu namnet: " + a1.hamtaNamn());
        
        prompt("\n* Säljer ett antal artiklar ..");
        a2.saljaArtikel(filter.getPositiveInt("Ange antal 'a1' att sälja: "));
        a2.saljaArtikel(filter.getPositiveInt("Ange antal 'a2' att sälja: "));

        prompt("\n* Ändrar pris på artiklar ..");
        a1.andraPris(filter.getPositiveInt("Ange nytt pris för 'a1': "));
        prompt("Artikeln 'a1's pris ändrat till " + a1.hamtaPris());
        
        prompt("\n* Fyller lagret ..");
        a1.fyllaLagret(filter.getPositiveInt("Ange antal av artikel 'a1'"));
        a2.fyllaLagret(filter.getPositiveInt("Ange antal av artikel 'a2'"));
        
        prompt("Totalt antal artiklar: " + Artikel.hamtaTotAntal());
        prompt("\n* Skapar ny artikel 'a3' ..");
        prompt("Totalt antal artiklar: " + Artikel.hamtaTotAntal());
        
        a1.skrivInfo();
        a2.skrivInfo();
    }

    /**
     * Skapar ett nytt 'Artikel'-objekt.
     * Användaren matar in samtliga startvärden.
     * @return      ett nytt 'Artikel'-objekt
     */
    public static Artikel createNewArtikel()
    {
        UserInputFilter filter = new UserInputFilter();

        int artikelnr      = filter.getPositiveInt("Ange artikelnummer: ");
        String artikelnamn = filter.getString("Ange artikelnamn: ");
        int lagerantal     = filter.getPositiveInt("Ange lagerantal: ");
        int pris           = filter.getPositiveInt("Ange artikelns pris: ");

        return new Artikel(artikelnr, artikelnamn, lagerantal, pris);
    }
    
    /**
     * "Wrapper" runt System.out.println() för mindre skrivande.
     * @param s     textsträng att skriva ut
     */
    public static void prompt(String s)
    {
        System.out.println(s);
    }
}
