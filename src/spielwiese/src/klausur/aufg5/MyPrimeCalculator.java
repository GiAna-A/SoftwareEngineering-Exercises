package spielwiese.src.klausur.aufg5;

import java.util.Scanner;

public class MyPrimeCalculator {

       static int callsCounter=0; //Klassenvariable:


        public static void main(String [] args) throws TooManyCallsException {
            Scanner input = new Scanner (System.in);
            while(true)
            {
                System.out.println("zahl eingeben");
                isPrime(input.nextInt());

            }
        }
        //1: Zahl wird eingegeben, 2: an die Methode übergeben-->dh. Methode wird aufgerufen, hier muss Counter hochgesetzt werden

        private static boolean isPrime(int number) throws TooManyCallsException{ //markiert, dass eine Exception in dieser Methode aufgerufen wird (oder try catch)

            callsCounter++; //keine neue Variable erzeugen man will es hier nur zählen, der Wert wird dann oben in der Klassenvariable gespeichert
            if(callsCounter==4){
                throw new TooManyCallsException("Sie haben zu viele Versuche gebraucht!");

            }
            if(number < 2) return false;
            for(int i=2; i<number; i++){
                if(number % i == 0)
                    return false;
            }
            return true;
        }
}
