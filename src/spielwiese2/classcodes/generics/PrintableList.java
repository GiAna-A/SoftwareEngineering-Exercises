package spielwiese2.classcodes.generics;

import java.util.ArrayList;

public class PrintableList <T> extends ArrayList<T> {
    public void print(){
        for (T t : this){
            System.out.println(t);
        }

    }

}
