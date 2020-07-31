package spielwiese2.classcodes.java8.functionalInterfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Consumer consumer= name -> System.out.println(name);
        consumer.accept(2);

        Consumer<String> stringConsumer= stringName-> System.out.println(stringName);
        stringConsumer.accept("Consumer");

        BiConsumer biConsumer= (onething, otherthing)-> System.out.println(otherthing);
        biConsumer.accept(2.0, 3);

        Consumer<String> genericConsumer= surName-> System.out.println(surName);
        genericConsumer.accept("World");

        BiConsumer<Integer, String> genericBiConsumer= (oneParameter, otherParameter)-> System.out.println(otherParameter);
        genericBiConsumer.accept(2,"May");

       Function<Integer,Integer> func= (a)-> (a/2);
        func.apply(10);

       Function <Integer,Integer>function= (a)->(a*2);
       function.apply(4);

        BiFunction <Integer,Integer,Integer> biFunction= (x, y)->x*y;
        biFunction.apply(3,4);

        List<Student> students= new ArrayList<>();
        students.add(new Student("mAY",40));
        students.add(new Student("mAY",12));
        students.add(new Student("mAY",18));
        int age=0;
        for(Student t:students){
             age=t.getAge();


        }
        Predicate<Integer> predicate= ( s)-> s==18;
        System.out.println(predicate.test(age)) ;

        Supplier supplier= ()->Math.random();
        double myValue1= (double) supplier.get();
        System.out.println(myValue1);

        Supplier <String> supplier1= ()-> String.valueOf(Math.random());
        String value=supplier1.get();
        System.out.println(value);

        Runnable runnable= ()-> {
            System.out.println("Using Lambda for Runnable");
            for (int i = 0; i <10 ; i++) {
                System.out.println(i);

            }
        };
        Thread thread= new Thread(runnable);
        thread.start();
        System.out.println("----------------------------------------------");

        Runnable runnable1= new Runnable() {
            @Override
            public void run(){
                for (int i = 0; i <20 ; i++) {
                    System.out.println(i);
                }
            }
        };
        Thread thread1= new Thread(runnable1);
        thread1.start();
        List<Student> students1= new ArrayList<>();
        Student studentA= new Student("Beate",29);
        Student studentB= new Student("Berbel",32);

        Comparator <Student> comparator= Comparator.comparing(e->e.getAge());
        int compareValue= comparator.compare(studentA,studentB);
        System.out.println(compareValue);

        Comparator<Student>comparator1= (Student s1, Student s2)->s1.getName().compareTo(s2.getName());
        comparator1.compare(studentA,studentB);

        //Comparable<Integer> comparable= ()->
      Supplier supplier2= ()->("Hello World");
      supplier2.get();


        Integer[] numbers = {5, 12, 11, 7};
        Comparator <Integer>comparator2= (Integer i1, Integer i2)-> i1.compareTo(i2);
        List<Object> strings = new ArrayList<>();
       // ArrayList <> strings1 = new ArrayList<String>();







    }
}
