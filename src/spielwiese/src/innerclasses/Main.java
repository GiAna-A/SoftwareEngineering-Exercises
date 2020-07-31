package spielwiese.src.innerclasses;

public class Main {
    public static void main(String[] args) {
        Pocket pocket = new Pocket("Red");

       /*
       wenn außerhalb der Klasse Objekte erzeugen werden sollen dann Klasse static machen
       sonst compile error
        */

        Pocket.Money money = new Pocket.Money(100);

        System.out.println();

    }
}
