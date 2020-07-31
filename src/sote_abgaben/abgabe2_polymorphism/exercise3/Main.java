package sote_abgaben.abgabe2_polymorphism.exercise3;

public class Main {
    public static void main(String[] args) {

        GamingMachine gamingMachine= new GamingMachine(50);


        for (int i = 0; i < 10; i++) {
            gamingMachine.play();
        }
        System.out.println("You get: "+ gamingMachine.getCash());
    }
}
