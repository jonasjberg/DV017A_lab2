/**
 *  DV017A :: Grundläggande programmering i Java
 *  860224 Jonas Sjöberg
 *  Högskolan i Gävle
 *  tel12jsg@student.hig.se
 *
 *  Labb #2    Uppgift 3
 */
package main;

import java.util.Random;

public class Lab2Uppg04
{
    private final static int RANGE_MIN = 1;
    private final static int RANGE_MAX = 10;

    private static int rightAnswer;
    private static int noGuesses       = 0;
    private static boolean hasWon = false;

    private final static String MSG_PROMPT = "gissa\\> ";
    private final static String MSG_WIN = "Rätt gissat! Du har gissat ";
    private final static String MSG_TOOLOW  = "Du har gissat för lågt!";
    private final static String MSG_TOOHIGH = "Du har gissat för högt!";
    private final static String MSG_AGAIN = "Spela en gång till (j/n): ";

    public static void main(String[] args)
    {
        int guess;
        rightAnswer = getRandNumber(RANGE_MIN, RANGE_MAX);

        printWelcome();
        do {
            guess = getGuess(MSG_PROMPT);
            noGuesses++;

            hasWon = checkGuess(guess, rightAnswer);
            
            if (hasWon) {
                if (!keepPlaying()) {
                   System.exit(0);
                }
            }
            
        } while (!hasWon);
    }
    
    public static void printWelcome()
    {
        System.out.println("Välkommen till gissa-talet spelet!");
        System.out.println("Du ska gissa på ett tal mellan "
                           + RANGE_MIN + " och " + RANGE_MAX);
    }
    
    public static int getGuess(String prompt)
    {
        UserInputFilter filter = new UserInputFilter();
        return filter.getPositiveInt(prompt);
    }
    
    public static int getRandNumber(int min, int max)
    {
       int range = Math.abs(max - min);
       Random rng = new Random();
       return rng.nextInt(range + 1) + 1;
    }
    
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
    
    public static boolean keepPlaying()
    {
       UserInputFilter filter = new UserInputFilter();
       boolean cont = filter.getYesNoAnswer(MSG_AGAIN);
       return cont;
    }

}
