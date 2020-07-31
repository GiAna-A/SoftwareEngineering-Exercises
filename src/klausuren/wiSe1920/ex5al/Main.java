package klausuren.wiSe1920.ex5al;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList <Employee> employees= new MyList<>();
        employees.add(new Employee(350000, "Lord"));
        employees.add(new Employee(200000, "MyLady"));
        employees.add(new Employee(420000, "May"));

        System.out.println(employees.getOccurencesByValue());

        System.out.println("-------------------------------------------------------");

        MyList1 <Integer> myList1= new MyList1<>();
        myList1.add(200);
        myList1.add(400);
        myList1.add(400);
        myList1.add(400);

        myList1.add(400);
        myList1.add(200);
        myList1.add(300);

        System.out.println(myList1.getOccurencesByValue());
    }
}
