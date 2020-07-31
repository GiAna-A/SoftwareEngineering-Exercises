package klausuren.soSe19.ex5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * how to test private methods with help of reflections
 */

public class PrimePrivateTest {
   public static PrimePrivate prime;

    @BeforeClass
    public static void beforeClass()  {
       prime=new PrimePrivate();

    }
   

    @Test
    public void testPrimeMethod () throws Exception {
        Method method = PrimePrivate.class.getDeclaredMethod("isPrime", int.class);
        method.setAccessible(true);
        boolean returnValue= (boolean) method.invoke("isPrime", 2);
        Assert.assertEquals(true,returnValue );
    }


}
