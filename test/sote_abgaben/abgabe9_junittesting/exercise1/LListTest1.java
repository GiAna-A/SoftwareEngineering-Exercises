package sote_abgaben.abgabe9_junittesting.exercise1;

import sote_abgaben.abgabe6_collections.exercise1.LList;
import sote_abgaben.abgabe8_exceptions.exercise2.LListTooSmallException;
import org.junit.Test;

public class LListTest1 {

    @Test (expected = LListTooSmallException.class)
    public void get_IndexTooBig() throws LListTooSmallException {
        LList list= new LList();
        list.insert(2);
        list.insert(2);
        list.insert(2);


        list.get(200);






    }
}
