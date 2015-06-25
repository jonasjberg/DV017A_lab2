/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 * 
 * Labb #2    JUnit test suite
 */

package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@formatter:off
@RunWith(Suite.class)
@SuiteClasses ({ 
                    Lab2Uppg03Test.class 
              })
@formatter:on

public class AllTests
{

}
