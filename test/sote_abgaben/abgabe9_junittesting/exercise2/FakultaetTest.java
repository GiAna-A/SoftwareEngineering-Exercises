package sote_abgaben.abgabe9_junittesting.exercise2;

import org.junit.Assert;
import org.junit.Test;

public class FakultaetTest {


    @Test
    public void testFakultät(){
        //given

        //when

        // then
        Assert.assertEquals(120,Fakultaet.factorial(5) );

    }
}
