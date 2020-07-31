package klausuren.soSe19.ex5;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeTest {
@Test
public void testPrimeMethod() throws TooManyCallsException{

    assertEquals(true, Prime.isPrime(2));

}

@Test
    public void testNegativeNumber() throws TooManyCallsException{
    assertEquals(false,Prime.isPrime(-1));
}

@Test(expected = TooManyCallsException.class)
    public void testException() throws TooManyCallsException{
    Prime.isPrime(5);
    Prime.isPrime(5);
    Prime.isPrime(5);
    Prime.isPrime(5);

}
}
