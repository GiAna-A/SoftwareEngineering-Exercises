package spielwiese2.classcodes.threads.daemon;

public class Main {
    public static void main(String[] args) {
        Thread thread= new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);

                }
            }
        };
        thread.setDaemon(true);
        thread.start();

    }
}
