/**
 *  DV017A :: Grundläggande programmering i Java
 *  860224 Jonas Sjöberg
 *  Högskolan i Gävle
 *  tel12jsg@student.hig.se
 *
 *  Labb #2    Uppgift 8
 */

package main;

public class Person
{
    private String namn;
    private long personnummer;
    private String adress;
    private int alder;

    /**
     * Konstruktor för klassen 'Person' som representerar en person.
     * @param namn      personens namn
     * @param ID        personens personnummer
     * @param adress    personens adress
     * @param alder     personens ålder
     */
    public Person(String namn, long ID, String adress, int alder)
    {
        this.namn = namn;
        this.personnummer = ID;
        this.adress = adress;
        this.alder = alder;
    }
    
    /**
     * Byter namn på personen.
     * @param namn  personens nya namn
     */
    public void byterNamn(String namn)
    {
        this.namn = namn;
    }
    
    /**
     * Ändrar personens adress.
     * @param adress    personens nya adress
     */
    public void byterAdress(String adress)
    {
        this.adress = adress;
    }
    
    /**
     * Gör personen ett år äldre.
     */
    public void fyllerAr()
    {
        alder++;
    }
    
    /**
     * Hämta personens namn
     * @return      personens namn
     */
    public String hamtaNamn()
    {
        return namn;
    }
    
    /**
     * Hämta personens personnummer
     * @return      personens personnummer
     */
    public long hamtaPersnr()
    {
        return personnummer;
    }
    
    /**
     * Hämta personens ålder
     * @return      personens ålder
     */
    public int hamtaAlder()
    {
        return alder;
    }
    
    /**
     * Hämta personens adress
     * @return      personens adress
     */
    public String hamtaAdress()
    {
        return adress;
    }
    
    /**
     * Returnerar objektets data i "human-readable" format
     */
    public String toString()
    {
        // Använder '\n' newlines trots att det inte är särskilt portabelt ..
        return ("\nNamn:         " + this.namn
              + "\nPersonnummer: " + this.personnummer
              + "\nAdress:       " + this.adress
              + "\nÅlder:        " + this.alder + "\n");
    }
}
