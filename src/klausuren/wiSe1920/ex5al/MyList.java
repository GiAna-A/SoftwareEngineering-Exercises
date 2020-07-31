package klausuren.wiSe1920.ex5al;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyList <T> extends ArrayList<Employee> {

    public Map<Integer, Integer> getOccurencesByValue(){
        Map<Integer,Integer> occurences=new HashMap<>();
        int counter=0;

        for (int i = 0; i < size(); i++) {
            for (int j = i+1; j <size() ; j++) {

                if (get(i).getSalary().equals(get(j).getSalary())){
                    counter ++;
                }
                //da sonst die Liste mit dem gleichen Eintrag überschrieben wird
                if (occurences.containsKey(get(i).getSalary())){
                    break;
                }
              //speichere Eintrag (Salary + counter in Map)
                occurences.put(get(i).getSalary(), counter);

            }
        }

        return occurences;
    }

    }

