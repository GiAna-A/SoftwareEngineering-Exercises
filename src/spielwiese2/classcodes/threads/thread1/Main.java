package spielwiese2.classcodes.threads.thread1;

public class Main {
    public static void main(String[] args) {
        PrintThread aThread= new PrintThread("a");
        PrintThread bThread= new PrintThread("b");

        aThread.start();
        bThread.start();
    }
}
