package spielwiese.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8 {
    public static void main(String[] args) {
        Ausgabe syso = ()->
                System.out.println("Ich will eine Massage!");
        syso.print();

        List<String> myList = Arrays.asList("element1", "element2");
        //vor Java 8
        for (String index : myList) {
            System.out.println(index);

        }
        //seit 8 Methode fore
        myList.forEach(new Consumer<String>() {
            @Override
            public void accept(String index) {
                System.out.println(index);

                         }
        });
        //lambda
        myList.forEach(index -> System.out.println(index));
    }


    @FunctionalInterface
    interface Ausgabe {
        public void print();

    }
}
