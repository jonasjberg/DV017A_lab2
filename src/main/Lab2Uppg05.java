/**
 *  DV017A :: Grundläggande programmering i Java
 *  860224 Jonas Sjöberg
 *  Högskolan i Gävle
 *  tel12jsg@student.hig.se
 *
 *  Labb #2    Uppgift 5
 */

package main;

public class Lab2Uppg05
{
    public static void main(String[] args)
    {
        UserInputFilter filter = new UserInputFilter();

        /* Hämta textsträng från användaren. */
        String text = filter.getString("Skriv in den sträng du vill leta i: ");
        /* Saknar skydd mot att användaren matar in annat än en bokstav. */
        char ch = filter.getString("Vilken bokstav vill du räkna: ").charAt(0);

        int chCount = 0;

        /* Gå igenom textsträngen 'text' ett tecken i taget och jämför tecknet
         * vid position 'i' med 'ch'. Öka räknaren om tecknet matchar. */
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) chCount++;
        }

        /* Skriv ut resultatet. */
        System.out.println(
                "Strängen innehåller " + chCount + " st " + ch + ":n.");
    }
}
