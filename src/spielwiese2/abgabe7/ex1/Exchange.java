package spielwiese2.abgabe7.ex1;

public class Exchange {

    public static void main(String[] args) {

    }
    public static <T> void changePositions (T[] array, int pos1, int pos2 ){
        T newPos=array[pos1];
        array[pos1]=array[pos2];
        array[pos2]=newPos;
    }
}
