package spielwiese.src.klausur.aufg4;

public class LambdaAusdruck {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(i);
                }
            }
        });
        thread.start();



        //das Runnable ist ein functional IF und kann mit Lambda vereinfacht werden
        Runnable run=()-> {
            for (int i = 0; i <200 ; i++) {
                System.out.println(i);

            }
        };
        Thread thread1= new Thread(run);
        thread.start();
    }

    

}
