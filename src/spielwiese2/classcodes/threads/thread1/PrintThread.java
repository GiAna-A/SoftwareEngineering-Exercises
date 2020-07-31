package spielwiese2.classcodes.threads.thread1;

public class PrintThread extends Thread {

    private String name;

    public PrintThread(String name) {
        this.name=name;
    }

    @Override
    public void run() {

        for(int i = 0; i<100; i++) {
            System.out.println(name);

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

