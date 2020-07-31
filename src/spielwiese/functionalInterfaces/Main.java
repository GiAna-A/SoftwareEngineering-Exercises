package spielwiese.functionalInterfaces;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        //Consumer
        Consumer consumer  = egalwas-> System.out.println(egalwas);


        //BiConsumer
        BiConsumer sayMyName = (name, surName) -> System.out.println( surName);
        sayMyName.accept("Fatih", "Nakay");


        //Supplier
        Supplier doubleSupplier = () -> Math.random();
        double myValue1= doubleSupplier.giveSth();
        System.out.println(myValue1);

        //Function
        Function isOdd= (x)-> x%2==1;
        boolean check= isOdd.check(3);
        System.out.println(check);


        // BiFunction
        BiFunction addieren= (a, b)-> a+b;
        int sum = addieren.calculate(2,5);
        System.out.println(sum);

        BiFunction dividieren = (a,b)-> a/b;
        System.out.println(dividieren.calculate(8,2));

        BiFunctionGenerics <Integer, Integer> multiply = (x,y)-> x*y;
        System.out.println(multiply.check(2,3));




    }
}
