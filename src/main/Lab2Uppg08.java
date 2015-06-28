/**
 *  DV017A :: Grundläggande programmering i Java
 *  860224 Jonas Sjöberg
 *  Högskolan i Gävle
 *  tel12jsg@student.hig.se
 *
 *  Labb #2    Uppgift 8
 */

package main;

public class Lab2Uppg08
{
    public static void main(String[] args)
    {
        UserInputFilter filter = new UserInputFilter();

        /* Skapa nya 'Person'-objekt. */
        prompt("Ange startvärden för \"person1\": ");
        Person person1 = createNewPerson();
        prompt("Ange startvärden för \"person2\": ");
        Person person2 = createNewPerson();

        /* Skriv ut information om 'Person'-objekten. */
        prompt("\nperson1\n-------" + person1.toString());
        prompt(  "person2\n-------" + person2.toString());

        /* Modifiera 'person1'. */
        person1.byterNamn(filter.getString("Ange nytt namn för person1: "));
        person1.byterAdress(filter.getString("Ange ny adress för person1: "));

        /* Låt 'person2' fylla år. */
        prompt("\n** person2 fyller år!\n");
        person2.fyllerAr();

        /* Skriv ut information om 'Person'-objekten. */
        // Använder '\n' newlines trots att det inte är särskilt portabelt ..
        prompt ("\nperson1\n-------"
              + "\nNamn:         " + person1.hamtaNamn()
              + "\nPersonnummer: " + person1.hamtaPersnr()
              + "\nAdress:       " + person1.hamtaAdress());

        prompt ("\nperson2\n-------"
              + "\nNamn:         " + person2.hamtaNamn()
              + "\nPersonnummer: " + person2.hamtaPersnr()
              + "\nÅlder :       " + person2.hamtaAlder());
    }

    /**
     * Skapar ett nytt 'Person'-objekt. 
     * Användaren matar in samtliga startvärden.
     * @return      ett nytt 'Person'-objekt
     */
    public static Person createNewPerson()
    {
        UserInputFilter filter = new UserInputFilter();

        String namn   = filter.getString("Ange namn: ");
        long persnr   = filter.getPositiveLong("Ange personnummer: ");
        String adress = filter.getString("Ange adress: ");
        int alder     = filter.getPositiveInt("Ange ålder: ") ;

        return new Person(namn, persnr, adress, alder);
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
