package spielwiese.src.probeklausur.aufg11;

import java.util.LinkedList;

/**
 * @author Giana
 */

public class MyList extends LinkedList<Integer> { //Linked List soll nur Methoden von Integer implementieren, nicht generisch
    //nur spitze Klammer hinter Klasse wenn nicht klar

    /**
     *
     * @return
     *
     */
    public int getAverage(){
        int average;
        int sum=0;
        for (int value:this) {
            sum = sum +  value; //downcast
        }
        average=sum/size(); //durch Vererbung kann size aufgreufen werden
        return average;
    }
}
