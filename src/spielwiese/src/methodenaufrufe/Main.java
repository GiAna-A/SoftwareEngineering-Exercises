package spielwiese.src.methodenaufrufe;

public class Main {
    public static void main(String[] args) {
        Spieler spieler= new Spieler("Spieler");

        Spielmaschine spielmaschine= new Spielmaschine(spieler); //wer spielt-->

        for (int i = 0; i <10 ; i++) {
            boolean win = spielmaschine.play(spieler);
            if(win){
                System.out.println("Gewonnen");

            }else{
                System.out.println("Verloren");

            }

        }
        System.out.println("player has"+ spieler.getSpieleinsatz());
    }
}
