package sote_abgaben.abgabe7_generics.exercise1;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        changePositions(strings, 1, 2);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println("-------------------");

        Integer[] ints = {1, 2, 3};

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        changePositions(ints, 1, 2);
        for (int i = 0; i <ints.length ; i++) {
            System.out.println(ints[i]);
        }

    }

    public static <T> void changePositions(T[] array, int pos1, int pos2) {
        T newPos = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = newPos;
    }
    // zur Laufzeit wird das T ersetzt
}
