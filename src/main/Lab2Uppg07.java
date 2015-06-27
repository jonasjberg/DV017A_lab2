/**
 *  DV017A :: Grundläggande programmering i Java
 *  860224 Jonas Sjöberg
 *  Högskolan i Gävle
 *  tel12jsg@student.hig.se
 *
 *  Labb #2    Uppgift 7
 */

package main;

public class Lab2Uppg07
{
    private static final String MSG_ISPRIME = "Talet är ett primtal!";
    private static final String MSG_NOTPRIME = "Talet är inte ett primtal.";
    private static int number;

    public static void main(String[] args)
    {
        UserInputFilter filter = new UserInputFilter();

        number = filter.getPositiveInt("Mata in ett positivt heltal: ");
        System.out.println(isPrimeNumber(number) ? MSG_ISPRIME : MSG_NOTPRIME);
    }

    /**
     * Undersöker om talet 'n' är ett primtal eller ej.
     * @param n     talet att undersöka
     * @return      sant om 'n' är ett primtal, annars falskt
     */
    public static boolean isPrimeNumber(int n)
    {
       for (int i = 2; i < n; i++ ) {
          if (n % i == 0)  return false;
       }

       return true;
    }

}
