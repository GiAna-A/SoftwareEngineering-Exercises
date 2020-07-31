package sote_abgaben.abgabe6_collections.exercise1;

import java.util.LinkedList;

    public class Main {
        public static void main(String[] args) {
            Student studentA = new Student("Max", "A");
            Student studentB = new Student("Peter", "B");
            Student studentC = new Student("Jens", "C");
            Student studentD = new Student("Franz", "D");
            Student studentE = new Student("Edward", "E");
            Student studentF = new Student("Fabian", "F");
            Student studentG = new Student("Lennard", "G");


       /* LinkedList<Student> linkedList= new LinkedList<>();
        linkedList.add(studentE);
        linkedList.add(new Student("May", "A"));
        linkedList.add(new Student("May", "A"));
        linkedList.add(new Student("May", "A"));*/

            LList  students = new LList();
            students.insert(studentA);
            students.insert(studentB);
            students.insert(studentC);
            students.insert(studentD);
            students.insert(studentE);
            students.insert(studentF);
            System.out.println("---------------------------\n");
            System.out.println("Ex1: Contain Methode: ");
            System.out.println(students.contains(studentG));

            System.out.println("---------------------------\n");
            System.out.println("Ex2: Put - Methode: ");
            students.put(60, studentF);
            for (int i = 0; i < students.size(); i++) {
                //     System.out.println(students.get(i));

            }

            System.out.println("---------------------------\n");
            System.out.println("Ex4: Remove Methode mit Objekt: ");
            students.remove(studentB);
            //TODO: Entferne letztes Element
            for (int i = 0; i < students.size(); i++) {
                //   System.out.println(students.get(i));
            }

            System.out.println("---------------------------\n");
            System.out.println("Exercise 5\n");
            students.insert(studentA);
            students.insert(studentB);
            students.insert(studentC);


            for (Object object : students) {
                System.out.println(object);
            }

            System.out.println("---------------------------\n");


        }
    }

