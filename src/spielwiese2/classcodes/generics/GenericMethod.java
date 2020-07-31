package spielwiese2.classcodes.generics;

public class GenericMethod <T> {
    public T random(T t, T s){
        return Math.random()>0.5 ?t:s;

    }
    public static <T> void random1(T t, T s){
        System.out.println(Math.random()>0.5 ?t:s);

    }

    public static void main(String[] args) {
        //not static
        GenericMethod<Integer> genericMethod= new GenericMethod<>();
        genericMethod.random(2,3);

        //static

        GenericMethod.random1("Hello", 2);
      //  String random2= GenericMethod.random1("Hello","World");
       // System.out.println(random2);

        //static
       // Number random3= GenericMethod.random1(2L,2.03);
        //search after mutual Type->here Numbers

    }
}
