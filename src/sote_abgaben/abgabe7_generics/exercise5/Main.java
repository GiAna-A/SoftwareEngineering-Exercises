package sote_abgaben.abgabe7_generics.exercise5;

import sote_abgaben.abgabe6_collections.exercise1.Student;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2);
        Integer last = getLast(ints);
        System.out.println(last);

        List <Student>  students= new LinkedList<>();
        Student student= new Student("kmlsk", "js");
        Student student1= new Student("mns,","js");
        students.add(student);
        students.add(student1);
        System.out.println(getLast(students));


        printObject(student);
        printObject("Hallo");
        printObject(3);

    }


    public static <T> T getLast(List<T> list) {
        return list.get(list.size()-1);
    }
    public static <T> void  printObject (T t){ //Methode kann mit iwas aufgerufen werden so. Übergabeparameter müssen nicht für jeden Typ bestimmt werden
        System.out.println(t);
    }

}
