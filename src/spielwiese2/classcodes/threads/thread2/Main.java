package spielwiese2.classcodes.threads.thread2;

public class Main {
    public static void main(String[] args) {
        PrintRunnable printRunnable= new PrintRunnable("a");
        PrintRunnable printRunnable1= new PrintRunnable("b");
        Thread aThread= new Thread(printRunnable);
        Thread bThread= new Thread(printRunnable1);
        aThread.start();
        bThread.start();

    }
}
