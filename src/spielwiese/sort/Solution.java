package spielwiese.sort;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        Student student1 = new Student(2576, "Fatih", 3.0);
        Student student2 = new Student(2576, "Jerome", 5.0);
        Student student3 = new Student(2576, "Fatih", 3.0);


        for (Student index:list) {
            System.out.println(index);

        }

        TreeSet<Student> ts = new TreeSet<>(new CPGAinDecreasingOrder());



        ts.add(student2);
        ts.add(student1);
        ts.add(student3);

        for (Student index : ts) {
            System.out.println(index);

        }
    }

}
