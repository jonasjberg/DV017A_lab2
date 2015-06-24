Laboration 2
============

Uppgifter:
----------

1. Vad är det för speciellt med en konstant variabel och visa hur man
   deklarerar en sådan? Skriv ett litet program på några rader där du använder
   dig av en konstant variabel.

2. Vilket värde får variablerna x och y efter det att uttrycket (a-g) beräknats
   (varje uttryck ska beräknas enskilt). Lös gärna först uppgiften i huvudet
   (lär man sig mycket på) utan att testa med något program.
   Följande deklaration finns i programmen:

       int x=4;
       int y=2;

       a.  y=x++;
       b.  y=++x;
       c.  y*=x;
       d.  y+=(x+2);
       e.  y+=--x;
       f.  y+=x++
       g.  x=-y;

3. Skriv ett program som räknar ut vilket av tre heltal som är det mellersta
   talet och sedan skriver ut detta tal. Användaren ska skriva in det tre
   heltalen, exempel på utskrift:

        Skriv in första talet: *7*
        Skriv in andra talet: *10*
        Skriv in tredje talet: *4*
        Det mellersta talet är 7

4. Skriv programmet som spelar det klassiska gissa-talet spelet.  Programmet
   ska först slumpa ut ett tal mellan 1 och 100. Detta tal ska den som spelar
   klura ut. Om man gissat för lågt eller för högt så ska "Du har gissat för
   lågt!" resp "Du har gissat för högt!" skrivas ut på skärmen. Man ska få
   fortsätta gissa tills man gissat rätt, "Rätt gissat!" skrivs då ut. Även
   antal gissningar ska skrivas ut. Varje gång man gissat rätt ska man få välja
   om man vill spela spelet igen eller avsluta.
   Så här kan exempelvis en körning se ut:

        Välkommen till gissa-talet spelet!
        Du ska gissa på ett tal mellan 1 och 100
        gissa\> *75*
        Du har gissat för högt!
        gissa\> *35*
        Du har gissat för lågt!
        gissa\> *60*
        Du har gissat för högt!
        gissa\> *40*
        Rätt gissat! Du har gissat 4 gånger.
        Spela en gång till (j/n): *n*
        Adjö!

5. Skriv ett program som räknar förekomsterna av en viss bokstav i en sträng
   (String- objekt), och som sedan skriver ut summan förekomster. Strängen och
   vilken bokstav som ska räknas skrivs in av den som kör programmet. Tips:
   använd metoderna charAt och length i klassen String.
   Exempel på hur utskriften kan se ut:

        Skriv in den sträng du vill leta i: *Kalle har en banan*
        Vilken bokstav vill du räkna: *a*
        Strängen innehåller 4 st a:n.

6. Skriv ett program som räknar och skriver ut hur många förekomster det finns
   av vokalerna a, e, i, o, u och y i en sträng. Strängen ska matas in av den
   som kör programmet. Du ska deklarera en räknar-variabel för varje vokal och
   använda dig av en switch-sats.
   Exempel på körning:

        Mata in strängen: *Du har min kursbok*
        I strängen finns: 1 st a:n
        0 st e:n
        1 st i:n
        1 st o:n
        2 st u:n
        0 st y:n

7. Ett heltal är ett primtal om det bara är delbart med 1 och sig självt.
   Exempelvis så är 2, 3, 5 och 7 primtal, men 4, 6, 8 och 9 är ej primtal.
   Skriv ett program som kontrollerar och skriver ut om ett tal är primtal
   eller ej. Den som kör programmet ska skriva in talet.
   Tips: använd modulus-operatorn %.

8. Skriv en klass Person som innehåller följande instansvariabler, deklarera
   med passande datatyper:

        namn, personnummer, adress, ålder.

   I klassen ska följande metoder ingå:

   * konstruktorn Person, som initierar samtliga instansvariabler.
   * byterNamn, en metod som via parameter ändrar namnet.
   * byterAdress, en metod som via parameter ändrar adressen.
   * fyllerÅr, en metod som lägger till 1 till åldern.
   * hamtaNamn, en metod som returnerar namnet.
   * hamtaPersnr, en metod som returnerar personnumret.
   * hamtaÅlder, en metod som returnerar åldern.
   * hamtaAdress, en metod som returnerar adressen.
   * toString, en metod som i en snyggt formaterad sträng returnerar ett
     Person-objekts *samtliga* data.  Metoden anropas genom att skriva
     objektets (referensens) namn.

   Skriv ett testprogram som testar samtliga metoder i klassen Person.
   Programmet ska i tur och ordning utföra följande:

   * Skapa två Person-objekt, person1 och person2. Den som kör ditt program ska
     mata in startvärden till de båda objektens samtliga data
     (instansvariabler).
   * Skriv ut de båda objektens samtliga data.
   * Låt den som kör ditt program byta namn och adress på person1.
   * Låt person2 fylla år.
   * Skriv ut namnet, personnr och adressen på person1 (skriv alltså inte ut
     åldern).
   * Skriv ut namnet, personnr och åldern på person2 (skriv alltså inte ut
     adressen).

9. Skriv en klass Artikel som ska representera ett artikelslag på ett
   varulager. Information som ska finnas om varje artikelslag är:

   artikelnr (int), artikelnamn (String), lagerantal (int), pris
   (double)

   Denna information är alltså klassens instansvariabler, passande datatyp står
   inom parentes. I klassen ska även finnas en *klassvariabel* som håller
   räkning på hur många artikelslag det finns totalt, alltså som innehåller
   totala antalet skapade Artikel-objekt:

   totArtiklar (int)

   I klassen ska följande metoder ingå:

   * konstruktorn Artikel, som initierar samtliga instansvariabler samt
     uppdaterar klassvariabelns värde.
   * ändraNamn, metod som via parameter ändrar på artikelnamnet.
   * hamtaNamn, metod som returnerar artikelnamnet.
   * säljaArtikel, metod som minskar lagerantalet med parameterns värde.
   * fyllaLagret, metod som ökar lagerantalet med parameterns värde.
   * ändraPris, metod som ändrar priset till parameterns värde.
   * hamtaPris, metod som returnerar artikelns pris.
   * hamtaTotAntal, klassmetod som returnerar antalet artikelslag.
   * skrivInfo, metod av returtypen void som skriver ut alla data om en artikel.

   Skriv också ett testprogram, där du testar klassens alla metoder.

