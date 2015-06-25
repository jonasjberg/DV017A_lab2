package main;

/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 * 
 * Labb #2    Uppgift 1
 */

public class Lab2Uppg01
{
    /* Konstanta variabler håller konstanter som förblir oförändrade under
     * programmets exekvering. Även om antal sekunder per minut med största
     * sannolikhet alltid kommer att vara 60 så är det "good practice" att
     * undvika att "hårdkoda magiska siffror" direkt i koden. */
    private static final int    SECONDS_PER_MINUTE = 60;
    private static final int    MINUTES_PER_HOUR   = 60;
    private static final int    HOURS_PER_DAY      = 24;

    /* Konstant variabel QUERY skrivs ut då användaren ombeds mata in sekunder. */
    private static final String QUERY              = "Var vänlig ange antal sekunder att omvandla till minuter och timmar.";

    public static void main(String[] args)
    {
      //@formatter:off
        UserInputFilter filter = new UserInputFilter();

        int sekunder = filter.getPositiveInt(QUERY);
        int minuter  = numberOfMinutesForSeconds(sekunder);
        int timmar   = numberOfHoursForMinutes(minuter);

        System.out.println("________________________________________");
        System.out.println("");
        System.out.println("Tid kvar:");
        System.out.println("            " + sekunder + " sekunder");
        System.out.println("            " + minuter + " minuter");
        System.out.println("            " + timmar + (timmar > 1 ? " timmar" : " timme"));
        System.out.println("________________________________________");
      //@formatter:on
    }

    /**
     * Beräknar antal minuter för ett givet antal sekunder.
     * 
     * @param seconds
     *            antal sekunder att beräkna
     * @return antal minuter
     */
    static int numberOfMinutesForSeconds(int seconds)
    {
        return seconds / SECONDS_PER_MINUTE;
    }

    /**
     * Beräknar antal timmar för ett givet antal minuter.
     * 
     * @param minutes
     *            antal minuter att beräkna
     * @return antal timmar
     */
    static int numberOfHoursForMinutes(int minutes)
    {
        return minutes / MINUTES_PER_HOUR;
    }
}
