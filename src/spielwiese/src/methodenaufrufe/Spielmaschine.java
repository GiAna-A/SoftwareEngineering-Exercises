package spielwiese.src.methodenaufrufe;

import java.util.Random;

public class Spielmaschine {
    private Spieler spieler;

    public Spielmaschine(Spieler spieler) {
        this.spieler = spieler;
    }

    //Play Methode
    public static boolean play(Spieler spieler) {
        Random random = new Random();
        boolean win = random.nextBoolean();
        if (win) {
            wonGame(spieler);

        }else{
            lostGame(spieler);

        }
        return win;

    }

    public static void wonGame(Spieler spieler) {
        int neuesBudget = spieler.getSpieleinsatz();
        spieler.setSpieleinsatz(neuesBudget);
    }
    public static void lostGame(Spieler spieler){
        int neuesBudget= spieler.getSpieleinsatz();
        spieler.setSpieleinsatz(neuesBudget);

    }
}
