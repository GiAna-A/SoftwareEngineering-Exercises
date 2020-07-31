package spielwiese2.classcodes.threads.synchronize;

public class Main {
    public static void main(String[] args) {
        PrintThread aThread= new PrintThread("Thread A");
        PrintThread bThread= new PrintThread("Thread B");

        aThread.start();
        bThread.start();
    }
}
