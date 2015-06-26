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
        
        for (int i = 0; i < heltal.length; i++) {
            heltal[i] = filter.getPositiveInt("Mata in heltal #" + (i + 1) + ": ");
        }
        
        System.out.println("Det mellersta talet är " + mellerstaTalet(heltal));
    }
    
    public static int mellerstaTalet(int[] tal)
    {
        int A = tal[0];
        int B = tal[1];
        int C = tal[2];
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
       
        if (A > B) {
            if (B > C) {
                return B;
            } else if (A > C){
                return C;
            } else {
                return A;
            }
        } else {
            if (A > C) {
                return A;
            } else if (B > C) {
                return C;
            } else {
                return B;
            }
        }
    }
    // Skriv in första talet: *7*¬
    // Skriv in andra talet: *10*¬
    // Skriv in tredje talet: *4*¬
    // Det mellersta talet är 7¬
}
