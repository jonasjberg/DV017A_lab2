/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #2    Uppgift 2
 */

package main;

public class Lab2Uppg02
{
    private static int x, y;

//@formatter:off
    public static void main(String[] args)
    {
        x = 4;
        y = 2;
                    showResults("start");  // Beräknar uttrycken A till G och
        /* A */     y     =     x++;       // skriver ut värdet av 'x' och 'y'
                    showResults("A");      // efter varje uttryck med hjälp av
        /* B */     y     =   ++x;         // metoden 'showResults()'.
                    showResults("B");
        /* C */     y    *=     x;
                    showResults("C");
        /* D */     y    +=    (x + 2);
                    showResults("D");
        /* E */     y    +=   --x;
                    showResults("E");
        /* F */     y    +=     x++;
                    showResults("F");
        /* G */     x     =    -y;
                    showResults("G");

        System.exit(0);
    }
//@formatter:on

    /**
     * Skriv ut värdet hos variabler x och y.
     * @param label     bokstav som representerar aktuellt uttryck
     */
    private static void showResults(String label)
    {
        System.out.println("Efter " + label + ": ");
        System.out.println("    int x = " + x);
        System.out.println("    int y = " + y);
        System.out.println();
    }
}
