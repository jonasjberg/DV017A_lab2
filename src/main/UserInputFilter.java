/**
 *  DV017A :: Grundläggande programmering i Java
 *  860224 Jonas Sjöberg
 *  Högskolan i Gävle
 *  tel12jsg@student.hig.se
 *
 *  Labb #2
 *
 */

package main;

import java.util.Scanner;

public class UserInputFilter
{
    /**
     * Hämta positivt heltal från användaren.
     * @param msg   meddelande vid förfrågan
     * @return      ett positivt heltal
     */
    public int getPositiveInt(String msg) 
    {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        int vetInt = 0;

        do {
            queryUser(msg);

            while (!scan.hasNextInt()) {
                queryUser(msg);
                scan.next();
            }

           vetInt = scan.nextInt();

        } while (vetInt <= 0);

        return vetInt;
    }

    /**
     * Skriv ut meddelande till användaren.
     * @param msg   meddelande att skriva ut
     */
    private static void queryUser(String msg)
    {
        if (msg != null) System.out.print(msg);
    }
    
    public boolean getYesNoAnswer(String msg)
    {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in); 
        
        String token = "";
        
        do {
            queryUser(msg);
            token = scan.nextLine().trim().toLowerCase();

            if      (token.equals("j"))  return true; 
            else if (token.equals("n")) return false;
            else                          { /* ? */ }

        } while (true);
    }
}
