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
    private final static int range_min = 1;
    private final static int range_max = 100;
    private int slumptal;

    public static void main(String[] args)
    {

    }
    
    public void printWelcome()
    {
        System.out.println("Välkommen till gissa-talet spelet!");
        System.out.println("Du ska gissa på ett tal mellan "
                           + range_min + " och " + range_max);
    }
    
    public int getRandNumber(int min, int max)
    {
       int range = Math.abs(max - min);
       Random rng = new Random();
       return rng.nextInt(range + 1) + 1;
    }
    
    public void checkGuess(int gissatTal)
    {
        if ()
    }
    
    

}
