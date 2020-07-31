package sote_abgaben.abgabe2_polymorphism.exercise3;

import java.util.Random;

public class GamingMachine {

    private int cash;


    public GamingMachine(int cash) {
        this.cash = cash;
    }

    public void play() {

        Random random = new Random();
        boolean win = random.nextBoolean();

        if (win) {
            this.cash+=10;
            System.out.println("gewonnen");

        } else {
            this.cash-=10;
            System.out.println("verloren");
        }
    }

    public int getCash() {
        return cash;
    }
}
