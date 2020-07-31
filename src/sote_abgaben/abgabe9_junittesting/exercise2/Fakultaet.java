package sote_abgaben.abgabe9_junittesting.exercise2;

public class Fakultaet {

    public static int factorial(int n) {
        assert n >= 0;

        int val = 1;

        for(int i = 1; i <= n; i++) {
            val *= i;
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
