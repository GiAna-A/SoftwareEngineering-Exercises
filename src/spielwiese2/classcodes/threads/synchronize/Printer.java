package spielwiese2.classcodes.threads.synchronize;

public class Printer {
    public static int variable=0;
    public synchronized static void print(String threadName) {
        for (int i = 0; i < 100; i++) {
            System.out.println(threadName+variable);
            variable++;

            try {   
                Thread.sleep(20);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
