package klausuren.probeklausur.ex6;

public class Main {
    public static void main(String[] args) {
        TriConsumer consumer= (String x,String y, String e)-> System.out.println(e);
        consumer.accept("Hello", "b", "c");
        }
    }

