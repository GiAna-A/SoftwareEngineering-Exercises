package spielwiese2.classcodes.threads.interrupted;

public class DbThread extends Thread {
    private String name;
    public DbThread(String name){
        this.name=name;

    }
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            try{
                Thread.sleep(20);
            }catch(InterruptedException e){
                System.out.println(name);
            }
        }
    }
}
