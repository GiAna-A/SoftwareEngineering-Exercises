package klausuren.wiSe1920;

import klausuren.wiSe1920.ex3.Faculty;
import klausuren.wiSe1920.ex3.InputLargerSevenException;
import org.junit.Assert;
import org.junit.Test;

public class FacultyTest {
    @Test
    public void testFactorial() throws InputLargerSevenException{

        Assert.assertEquals(2, Faculty.factorial(2));

        //
    }
    @Test(expected = InputLargerSevenException.class)
    public void testException() throws InputLargerSevenException{
        //given and when
        Faculty.factorial(8);
    }

    @Test
    public void testNegativeInput() throws InputLargerSevenException{

        Assert.assertEquals(1, Faculty.factorial(-1));

        //
    }

}
