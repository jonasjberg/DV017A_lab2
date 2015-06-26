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
    private static int count_a = 0;
    private static int count_e = 0;
    private static int count_i = 0;
    private static int count_o = 0;
    private static int count_u = 0;
    private static int count_y = 0;

    public static void main(String[] args)
    {
        UserInputFilter filter = new UserInputFilter();

        String text = filter.getString("Mata in strängen: ");

        /* Gå igenom textsträngen 'text' ett tecken i taget och gör jämförelsen
         * i en switch-sats. Öka respektive räknare om tecknet matchar. */
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
            case 'a':
                count_a++;
                break;
            case 'e':
                count_e++;
                break;
            case 'i':
                count_i++;
                break;
            case 'o':
                count_o++;
                break;
            case 'u':
                count_u++;
                break;
            case 'y':
                count_y++;
                break;
            default:
                break;
            }
        }

        /* Skriv ut resultatet. */
        System.out.println("I strängen finns: " + count_a + " st a:n");
        System.out.println("                  " + count_e + " st e:n");
        System.out.println("                  " + count_i + " st i:n");
        System.out.println("                  " + count_o + " st o:n");
        System.out.println("                  " + count_u + " st u:n");
        System.out.println("                  " + count_y + " st y:n");
    }
}
