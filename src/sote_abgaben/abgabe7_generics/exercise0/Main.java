package sote_abgaben.abgabe7_generics.exercise0;

import sote_abgaben.abgabe1_inheritance_interfaces.flightsystem.Human;
import sote_abgaben.abgabe1_inheritance_interfaces.flightsystem.Pilot;
import sote_abgaben.abgabe6_collections.exercise1.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        LList<String> strings = new LList<>();
        strings.insert("ggj");


        LList<Student> students = new LList<>();
        Student student = new Student();
        student.setName("Fatih");
        students.insert(student);

        for (Student s :
                students) {
            s.getName(); //sichergestellt, dass Methode vorhanden ist!!
        }

        //ohne Generics keine Typensicherheit, es ist nicht klar aus was Liste besteht
        List list = new ArrayList();
        list.add(student);
        list.add("das ist ein Text");
        list.add(1992);

        for (Object s1 : list) {
             //  { s1.getName();
        }

        LList<Human> humans = new LList<>();
        Pilot pilot = new Pilot("Bob", 26);
        humans.insert(pilot);
        for (Human h:humans
             ) {
            h.getName();
        }


    }
}
