package spielwiese2.classcodes.generics;

public class MainPrintableList {
    public static void main(String[] args) {
        PrintableList<Integer> printableList= new PrintableList<>();
        printableList.add(42);
        printableList.add(43);

        int double1=1;

        double zahl= double1;
        int zahl1= (int) zahl;

        Object o= 42;
        String string= (String) o;

    }

}
