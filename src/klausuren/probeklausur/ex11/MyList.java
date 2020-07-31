package klausuren.probeklausur.ex11;

import java.util.ArrayList;


public class MyList <T> extends ArrayList<Employee> {

    public int getAgeList(){
        int sum= 0;
        for (Employee t: this){ // Iterator ist bereits ein Objekt
            sum+= t.getAge();

        }
        for (int i = 0; i <size() ; i++) {
            sum+= get(i).getAge(); // i=index
        }
        return sum/size();
    }
}
