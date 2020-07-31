package spielwiese.genericserrors;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("String");
        list.add(12.0);
        list.add(5L);


        Long item3= (Long) list.get(2);
      //  String item2= (String) list.get(1);

    }
}
