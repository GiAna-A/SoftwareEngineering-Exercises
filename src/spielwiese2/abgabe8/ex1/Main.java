package spielwiese2.abgabe8.ex1;

public class Main {
    public static void main(String[] args) throws NegativeIndexException, IndexOutOfRangeException {
        LList  studentLList= new LList();
        studentLList.insert("Max Mustermann");
        studentLList.insert("Max Mustermann");
        studentLList.insert("Max Mustermann");
        studentLList.insert("Max Mustermann");

        for(Object i: studentLList){
            System.out.println(i);


        }
        //studentLList.insert(-1,"Tina Turner");
        studentLList.get(30);

    }
}
