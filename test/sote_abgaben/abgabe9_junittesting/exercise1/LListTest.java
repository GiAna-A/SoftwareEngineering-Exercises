package sote_abgaben.abgabe9_junittesting.exercise1;


import org.junit.Assert;
import org.junit.Before;
import sote_abgaben.abgabe6_collections.exercise1.LList;
import sote_abgaben.abgabe6_collections.exercise1.Student;
import org.junit.jupiter.api.Test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class LListTest { //beinhaltet die Liste den Studenttest = nein
    //Testmethoden sind immer void!! bei assert zbsp Rückgabe boolean



    @Test
    public void testContain() {
        //given
        LList llist = new LList(); //leere Liste
        Student studentTest = new Student("Max", "A"); //Student erzeugt
        llist.insert(studentTest);
        //when
        llist.contains(studentTest);
        //then
        Assert.assertEquals(true, llist.contains(studentTest)); //bei actual immer nur Methoden eingeben
        //das was ich erwarte, actual: das was Maschine übergibt

    }

    @Test
    public void testInsert() { //wenn man es insertet soll Liste größer sein
        //given
        LList llist = new LList();
        Student studentTest = new Student("Max", "A");
        //when
        llist.insert(studentTest);
        //then
        assertEquals(1, llist.size());

    }

    @Test
    public void testRemove() {
        //given
        LList llist = new LList();
        Student studentTest = new Student("Max", "A");
        Student studentTest2 = new Student("Max", "A");
        Student studentTest3 = new Student("Max", "A");

        //when
        //Liste startet immer bei 1, get startet bei 0, bei List get(0)-->head (wie ein Array), getSize()->fängt bei 1 an
        //hier wird size gestartet als bei 1 an
        llist.insert(studentTest); //index: 1
        llist.insert(studentTest2); //index: 2
        llist.insert(studentTest3); //index: 3

        //1 removed -->
        llist.remove(studentTest);

        //then
        assertEquals(2, llist.size());
    }


}
