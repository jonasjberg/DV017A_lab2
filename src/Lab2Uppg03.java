/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 * 
 * Labb #2    Uppgift 3
 */

public class Lab2Uppg03
{
    private static int heltal[] = new int[3];
    
    public static void main(String[] args)
    {
        UserInputFilter filter = new UserInputFilter(); 
        
        for (int tal : heltal) {
            tal = filter.getPositiveInt("Var vänlig mata in heltal ") 
        }

    }

    // Skriv in första talet: *7*¬
    // Skriv in andra talet: *10*¬
    // Skriv in tredje talet: *4*¬
    // Det mellersta talet är 7¬
}
