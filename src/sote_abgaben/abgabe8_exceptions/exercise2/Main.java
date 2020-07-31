package sote_abgaben.abgabe8_exceptions.exercise2;

import sote_abgaben.abgabe6_collections.exercise1.LList;
import sote_abgaben.abgabe6_collections.exercise1.Student;

public class Main {
    public static void main(String[] args) throws LListTooSmallException {
        Student studentA = new Student("Max", "A");
        Student studentB = new Student("Peter", "B");


        sote_abgaben.abgabe6_collections.exercise1.LList students = new LList();
        students.insert(studentA);
        students.insert(studentB);
        System.out.println("---------------------------\n");
       // try {
            students.get(5);
     //   }catch(LListTooSmallException e){
            //System.out.println("Liste hat nicht genügend Elemente.");
     //       e.printStackTrace(); //exception soll messsage von exception ausgeben, e von Exception

     /*   try{
            students.remove(20);
        }catch (LListTooSmallException e){
            //System.out.println("Liste hat nicht genügend Elemente.");
            e.printStackTrace();
        }*/

    }
}
