package klausuren.soSe19.ex5;

public class Prime {


    public static int counter=0;

    public static boolean isPrime(int number) throws TooManyCallsException{
        counter++;
        if(counter==4){
            throw new TooManyCallsException("Your testversion has expired");

        }

        if(number < 2) return false;
        for(int i=2; i<number; i++){
            if(number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws TooManyCallsException {
        System.out.println(isPrime(5));
        System.out.println(isPrime(5));
        System.out.println(isPrime(5));
        System.out.println(isPrime(5));


    }
}
