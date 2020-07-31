package spielwiese;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        HashSet<String> myHash= new HashSet<String>();

        myHash.add("Deutschland");
        myHash.add("Schweiz");
        myHash.add("India");
        myHash.add("Australia");

        myHash.contains("Deutcshland");
        System.out.println(myHash);

        myHash.remove("Schweiz");
        System.out.println(myHash);



        System.out.println(myHash.size());

        Iterator <String> i= myHash.iterator();
        while (i.hasNext())
            System.out.println(i.next());

    }
}
