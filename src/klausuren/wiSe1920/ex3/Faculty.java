package klausuren.wiSe1920.ex3;

public class Faculty {

    public static int factorial(int n)throws InputLargerSevenException {
        if(n>7){
            throw new InputLargerSevenException("Nope");

        }
        return n <= 1 ? 1 : n * factorial(n - 1);
    }
}
