/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 * 
 * Labb #2    Uppgift 3
 */

package main;

public class Lab2Uppg03
{
    private static int heltal[] = new int[3];
    
    public static void main(String[] args)
    {
        UserInputFilter filter = new UserInputFilter(); 
        int index = 1;
        
        for (int tal : heltal) {
            tal = filter.getPositiveInt("Mata in heltal #" + index++ + ": ");
        }

        
    }

    
//    public int mellerstaTalet(int[] tal)
//    {
//        int A = tal[0];
//        int B = tal[1];
//        int C = tal[2];
//        System.out.println("A = " + A);
//        System.out.println("B = " + B);
//        System.out.println("C = " + C);
//        
//        if (B > A) {
//            System.out.println("B > A");
//            if (C < A) return A;
//            else       return B;
//        } else {
//            System.out.println("!(B > A)");
//            if (A < B) return B;
//            else       return C;
//        }
//    }
    
    public int mellerstaTalet(int[] tal)
    {
        int A = tal[0];
        int B = tal[1];
        int C = tal[2];
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);

        

    }
    // Skriv in första talet: *7*¬
    // Skriv in andra talet: *10*¬
    // Skriv in tredje talet: *4*¬
    // Det mellersta talet är 7¬
}
