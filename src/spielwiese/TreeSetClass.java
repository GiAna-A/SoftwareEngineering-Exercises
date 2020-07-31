package spielwiese;

public class TreeSetClass  {
    public static void main(String[] args)
    {
        java.util.TreeSet<StringBuffer> ts = new java.util.TreeSet<StringBuffer>();

        // Elements are added using add() method
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));
        ts.add(new StringBuffer("O"));

        // We will get RunTimeException :ClassCastException
        // As StringBuffer does not implements Comparable interface
        System.out.println(ts);
    }

}
