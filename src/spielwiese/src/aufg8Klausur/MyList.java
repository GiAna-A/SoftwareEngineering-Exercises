package spielwiese.src.aufg8Klausur;

import java.util.ArrayList;

/**
 *
 * @param <T>
 * @author Giana
 * die Objekte der Klasse sollen von der Klasse Comparable erben damit man Objekte vergleichen kann
 */
public class MyList<T extends Comparable<T>> extends ArrayList<T> {
    /**
     *
     * @return
     */

    public T getSmallestElement() {
        T smallestElement = get(0); //erster Eintrag aus der Liste wird geholt
        for (T t : this) {
            t.compareTo(smallestElement); //um auf compareTo Methode zu greifen muss das T von Comparable erben
            if (t.compareTo(smallestElement) < 0) { //auf das t soll die compareTo Methode angewendet werden
                smallestElement = t; //smallestElement soll sich verändern
            }
        }
        return smallestElement;
    }
    public T getEldestProf(){
        T bigElement= get(0);
        for (T t:this) {
            if(t.compareTo(bigElement) > 0){
                bigElement = t;

            }

        }
        return bigElement;
    }
}
