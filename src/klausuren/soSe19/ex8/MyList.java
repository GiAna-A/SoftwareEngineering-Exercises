package klausuren.soSe19.ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MyList<T extends Comparable<T>> extends ArrayList<T> {
    List <Integer>list= new ArrayList<>();
    public MyList(){
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(5);
    }
    public T getSmallestElement(){
       T smallestELement= get(0);
        for (int i = 0; i < size(); i++) {
            if (get(i).compareTo(smallestELement)<0){
                smallestELement=get(i);



        }
       }
        return smallestELement;
    }

    public T getSmallestElement1(){
        T smallestElement= get(0);
        for (int i = 0; i <size() ; i++) {
            for (int j = i+1; j < size(); j++) {
                if(get(i).compareTo(get(j))>0){
                    smallestElement=get(i);

                }

            }
        }
        return smallestElement;
    }

}
