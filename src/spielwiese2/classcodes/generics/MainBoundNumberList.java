package spielwiese2.classcodes.generics;

public class MainBoundNumberList {
    public static void main(String[] args) {
        BoundNumberList <Double> integers= new BoundNumberList<>();
        integers.add(2.0);
       // integers.add(5L);
        for (Double t:integers       ) {
            System.out.println(t);

        }

    }
}
