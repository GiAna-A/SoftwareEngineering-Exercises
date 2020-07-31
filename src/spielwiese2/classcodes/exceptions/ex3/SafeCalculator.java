package spielwiese2.classcodes.exceptions.ex3;

public class SafeCalculator {
    public int calculate(int a, int b) throws NumberTooLargeException, NumberTooSmallException {
        int result = a + b;
        if (a > 0 && b > 0 && result < 0) {
            throw new NumberTooLargeException("Number too large.");

        } else if (a < 0 && b < 0 && result > 0) {
            throw new NumberTooSmallException("Numbers are too small.");

        }
        return result;

    }
}



