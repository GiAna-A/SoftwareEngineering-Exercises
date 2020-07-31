package spielwiese2.ex2;

import spielwiese2.abgabe9.ex2.Factorial;
import spielwiese2.abgabe9.ex1.NumberInputTooSmallException;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testCalculate() throws NumberInputTooSmallException {
        //given
        Factorial factorial= new Factorial();
        // when
        factorial.calculate(2);

        Assert.assertEquals(1, factorial.calculate(2));

    }


    @Test
    public void testZeroCalculate() throws NumberInputTooSmallException {
        //given
        Factorial factorial= new Factorial();
        // when
        factorial.calculate(0);
        //then
        Assert.assertEquals(1, factorial.calculate(0));
    }

    @Test(expected = NumberInputTooSmallException.class)
    public void testException () throws NumberInputTooSmallException {
        //given
        Factorial factorial= new Factorial();
        //when
        factorial.calculate(Integer.MIN_VALUE);

    }
}
