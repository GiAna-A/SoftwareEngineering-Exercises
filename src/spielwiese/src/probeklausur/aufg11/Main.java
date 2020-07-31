package spielwiese.src.probeklausur.aufg11;

public class Main {
    public static void main(String[] args) {
        MyList list= new MyList(); //liste soll nur aus Integer bestehen
        list.add(100);
        list.add(350);


        System.out.println(list.getAverage());

    }
}
