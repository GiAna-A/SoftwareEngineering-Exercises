package spielwiese2.classcodes.threads.interrupted;

public class Main   {
    public static void main(String[] args) throws InterruptedException {
        DbThread dbThread= new DbThread("DbThread");
        dbThread.start();
        FrontEndThread frontEndThread= new FrontEndThread();
        frontEndThread.start();
        dbThread.join();

        frontEndThread.interrupt();
    }
}
