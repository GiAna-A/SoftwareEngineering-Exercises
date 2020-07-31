package spielwiese2.abgabe1.ex3;

public class Building {
    public String name;
    public void getName(){
        System.out.println("This is the"+ name);
    }
    class Room{
        int roomNr;
        public void getRoomNr(){
            System.out.println("The Room has the number" + roomNr);
        }
    }
}
