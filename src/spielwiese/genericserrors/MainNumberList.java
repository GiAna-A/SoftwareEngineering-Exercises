package spielwiese.genericserrors;

public class MainNumberList {
    public static void main(String[] args) {
        NumberList numbers= new NumberList();
        numbers.add(5L);
        numbers.add(4L);
        numbers.add(42);
        numbers.add(3.0);

        Number n = numbers.get(0);
        System.out.println(n);

    }
}
