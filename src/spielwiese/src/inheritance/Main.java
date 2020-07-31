package spielwiese.src.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Orchidee orchidee = new Orchidee();
        orchidee.getOrchidee();
        orchidee.getPflanze();
        orchidee.getLebe();

        Lebewesen l = new Orchidee(); //hat zwar alle Instanzen von Lebewesen aber nur die Methode von Lebewesen
        l.getLebe();

        l = orchidee;//alle Instanzen
        //orchidee = l; das geht nicht, ist ein Downcast
        //nur mit Casting bekommt man alle Instanzen und Methoden
        Orchidee o = new Orchidee();

        //downcasting


        Teacher t = new Teacher();
        t.doSomething();
        //  Person person= new Person();
        /*compile error-->von abstrakten Klassen kann keine Instanz erzeugt werden, außer anonyme Klasse
        Unterschied zu IF: Methode kann in abstrakte Klasse definiert werden (was soll es tun?)
        und kann wie bei Vererbung überschrieben werden außer wenn final
        */
        List<Person> liste = new ArrayList<>();


        if (l instanceof Pflanze) {
            System.out.println("fef");
        }

    }
}
