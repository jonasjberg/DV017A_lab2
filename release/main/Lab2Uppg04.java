/**
 *  DV017A :: Grundläggande programmering i Java
 *  860224 Jonas Sjöberg
 *  Högskolan i Gävle
 *  tel12jsg@student.hig.se
 *
 *  Labb #2    Uppgift 4
 */

package main;

import java.util.Random;

public class Lab2Uppg04
{
    /* Gissa ett tal mellan RANGE_MIN och RANGE_MAX. */
    private final static int    RANGE_MIN   = 1;
    private final static int    RANGE_MAX   = 100;

    private static int          rightAnswer;
    private static int          noGuesses   = 0;
    private static boolean      hasWon      = false;

    /* Meddelanden till spelaren. */
    private final static String MSG_PROMPT  = "gissa\\> ";
    private final static String MSG_WIN     = "Rätt gissat! Du har gissat ";
    private final static String MSG_TOOLOW  = "Du har gissat för lågt!";
    private final static String MSG_TOOHIGH = "Du har gissat för högt!";
    private final static String MSG_AGAIN   = "Spela en gång till (j/n): ";
    private final static String MSG_BYE     = "Adjö!";

    public static void main(String[] args)
    {
        resetGame();

        do {
            int guess = getGuess(MSG_PROMPT);
            noGuesses++;

            hasWon = checkGuess(guess, rightAnswer);

            if (hasWon) {
                if (!keepPlaying()) {
                    System.out.println(MSG_BYE);
                    System.exit(0);
                } else {
                    resetGame();
                }
            }

        } while (!hasWon);
    }

    /**
     * Skriver ut ett välkomstmeddelande.
     */
    public static void printWelcome()
    {
        System.out.println("----------------------------------");
        System.out.println("Välkommen till gissa-talet spelet!");
        System.out.println("Du ska gissa på ett tal mellan "
                           + RANGE_MIN + " och " + RANGE_MAX);
    }

    /**
     * Hämtar en gissning från spelaren. Måste vara ett positivt heltal.
     * @param prompt        skrivs ut då spelaren ombeds mata in gissning
     * @return              ett positivt heltal
     */
    public static int getGuess(String prompt)
    {
        UserInputFilter filter = new UserInputFilter();
        return filter.getPositiveInt(prompt);
    }

    /**
     * Genererar ett slumptal mellan 'min' och 'max'.
     * @param min       talets lägsta möjliga värde
     * @param max       talets högsta möjliga värde
     * @return          ett slumpmässigt heltal mellan 'min' och 'max'
     */
    public static int getRandomNumber(int min, int max)
    {
        int range  = Math.abs(((max - min) + 1) + min);
        Random rng = new Random();
        /* '(range + 1)' kompenserar för beräkningen av range.
         * rng.nextInt(100) ger ett tal mellan 0-99, därav en ytterligare '+1'.*/
        return rng.nextInt(range);
    }

    /**
     * Undersök om det gissade talet är rätt svar.
     * @param guess         gissat tal
     * @param answer        rätt svar
     * @return              sant om gissning stämmer, annars falskt
     */
    public static boolean checkGuess(int guess, int answer)
    {
        if (guess == answer) {
            System.out.println(MSG_WIN + noGuesses + " gånger.");
            return true;
        } else if (guess < answer) {
            System.out.println(MSG_TOOLOW);
            return false;
        } else if (guess > answer) {
            System.out.println(MSG_TOOHIGH);
            return false;
        } else {
            return false;
        }
    }

    /**
     * Fråga om användaren vill fortsätta spela.
     * @return      sant om spelet ska fortsätta
     */
    public static boolean keepPlaying()
    {
        UserInputFilter filter = new UserInputFilter();
        boolean cont = filter.getYesNoAnswer(MSG_AGAIN);
        return cont;
    }

    /**
     * Nollställer variabler och startar en ny spelomgång.
     */
    public static void resetGame()
    {
        hasWon = false;
        noGuesses = 0;
        rightAnswer = getRandomNumber(RANGE_MIN, RANGE_MAX);
        printWelcome();
    }
}
