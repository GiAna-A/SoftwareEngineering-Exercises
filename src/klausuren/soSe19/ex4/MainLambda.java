package klausuren.soSe19.ex4;

public class MainLambda {
    public static void main(String[] args) {
        Runnable runnable=()->{
            for (int i = 0; i <200 ; i++) {
                System.out.println(i);
            }
        };
        Thread thread= new Thread(runnable);
        thread.start();
    }
}
