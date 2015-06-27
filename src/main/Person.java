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
    private int personnummer;
    private String adress;
    private int alder;

   
    public Person(String namn, int ID, String adress, int alder)
    {
        this.namn = namn;
        this.personnummer = ID;
        this.adress = adress;
        this.alder = alder;
    }
    
    public void byterNamn(String namn)
    {
        this.namn = namn;
    }
    
    public void fyllerAr()
    {
        alder++;
    }
    
    public String hamtaNamn()
    {
        return namn;
    }
    
    public int hamtaPersnr()
    {
        return personnummer;
    }
    
    public int hamtaAlder()
    {
        return alder;
    }
    
    public String hamtaAdress()
    {
        return adress;
    }
    
    public String toString()
    {
        return ("Namn: " + this.namn + "    Personnummer: " + this.personnummer
                + "    Adress:" + this.adress + "    Ålder: " + this.alder);
    }

    public static void main(String[] args)
    {



    }
    
    
    
    

}
