package spielwiese2.classcodes.threads.synchronize;

public class PrintThread extends Thread {

    private String name;
    public  PrintThread(String name){
        this.name=name;

        }
        @Override
    public void run(){
            Printer.print(name);
        }
}
