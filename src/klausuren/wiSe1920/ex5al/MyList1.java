package klausuren.wiSe1920.ex5al;

import java.util.*;

public class MyList1 <T> extends ArrayList<Integer> {

    public Map<Integer, Integer> getOccurencesByValue(){

        Map<Integer,Integer> occurences=new HashMap<>();

        for (int i = 0; i < size(); i++) {
            int counter=1;

            if (occurences.containsKey(get(i))){

                counter = occurences.get(get(i))+1;
            }
            occurences.put(get(i), counter);
        }
        return occurences;

    }
}
