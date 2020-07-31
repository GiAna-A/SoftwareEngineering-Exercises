package spielwiese2.classcodes.threads.interrupted;

public class FrontEndThread extends Thread {
    @Override
    public void run(){
        while (!isInterrupted()){
            System.out.println(".................");
            try {
                Thread.sleep(20);
            }catch (InterruptedException e){
                interrupt();
            }
        }
    }
}
