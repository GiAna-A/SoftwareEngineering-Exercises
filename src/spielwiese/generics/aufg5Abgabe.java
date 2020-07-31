package spielwiese.generics;

import java.util.Arrays;
import java.util.List;

public class aufg5Abgabe {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2);
        Integer last= getLast(ints);
        System.out.println(last);
    }



    public static <T> T getLast(List <T> list) {
        return  list.get(list.size()-1);
    }
}
