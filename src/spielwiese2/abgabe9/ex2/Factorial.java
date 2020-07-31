package spielwiese2.abgabe9.ex2;

import spielwiese2.abgabe9.ex1.NumberInputTooSmallException;

public class Factorial {
    public int calculate ( int n) throws NumberInputTooSmallException {
        if(n<0){
            throw new NumberInputTooSmallException("Input too small");

        }
        if(n<=0){
            return 1;

        }else{
            return calculate( n-1);
        }

    }
}
