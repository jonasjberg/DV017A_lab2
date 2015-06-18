/**
 *  DV017A :: Grundläggande programmering i Java
 *  860224 Jonas Sjöberg
 *  Högskolan i Gävle
 *  tel12jsg@student.hig.se
 *
 *  Labb #2
 *  Uppgift 1
 */


public class Lab2Uppg01 {
	
	private static final int SECONDS_PER_MINUTE = 60;
	private static final int MINUTES_PER_HOUR = 60;

	public static void main(String[] args) {
		
		System.out.format("SECONDS_PER_MINUTE = %d\n"
				      + "\nMINUTES_PER_HOUR = %d\n", 
				      SECONDS_PER_MINUTE, MINUTES_PER_HOUR);
		
		SECONDS_PER_MINUTE = 921;

		

	}

	int numberOfMinutes(int seconds) {
		return seconds / 60;
	}
	
	int numberOfHours(int minutes) {
		return minutes / 60;
	}

}
