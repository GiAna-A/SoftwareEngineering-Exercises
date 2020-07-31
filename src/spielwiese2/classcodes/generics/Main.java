package spielwiese2.classcodes.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Wrapper<Integer> wrapper= new Wrapper<>();
        wrapper.setValue(41);
        increment(wrapper);

        Wrapper <Double> wrapper1= new Wrapper<>();
        wrapper1.setValue(2.0);
        incrementD(wrapper1);
    }

    public static void increment(Wrapper<Integer> wrapper){
        Integer value= wrapper.getValue();
        wrapper.setValue(value+1);

    }
    public static void incrementD(Wrapper<Double> wrapper1){
        Double value= wrapper1.getValue();
        wrapper1.setValue(value+1);

    }
    List<Integer> integers= new ArrayList<Integer>();

    List <Number> numbers= new ArrayList<>(integers);
}
