/**
 *  DV017A :: Grundläggande programmering i Java
 *  860224 Jonas Sjöberg
 *  Högskolan i Gävle
 *  tel12jsg@student.hig.se
 *
 *  Labb #2
 *  
 */

import java.util.Scanner;

public class UserInputFilter
{

    public static void main(String[] args) {
        System.exit(0);
    }
    
    /**
     * Hämta positivt heltal från användaren.
     * @param msg   meddelande vid förfrågan
     * @return      ett positivt heltal
     */
    public static int getPositiveInt(String msg) {
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
    
    private static void queryUser(String msg) {
            if (msg != null) System.out.print(msg);
    }
    
}




    
