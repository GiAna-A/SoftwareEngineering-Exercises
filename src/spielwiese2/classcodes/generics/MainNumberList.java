package spielwiese2.classcodes.generics;

public class MainNumberList {
    public static void main(String[] args) {
        NumberList numbers= new NumberList();
        numbers.add(23);
        numbers.add(5.00);
        numbers.add(5L);
       // numbers.add("String");

        Number n= numbers.get(0);//+numbers.get(1);



    }


}
