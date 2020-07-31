package spielwiese.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    Object o = new String("hello");

    List<String> strings = new ArrayList<String>();


    //List<Object> strings2= new ArrayList<String>();
    List <? extends  Object> strings3= new ArrayList<String>();
    //List<Number> numbers = integers;


}
