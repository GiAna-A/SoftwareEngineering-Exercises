package spielwiese2.abgabe2.ex2;

public class Airplane {
    String engine;
    int id;
    int amountOfSeats;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    public void print(){
       System.out.println(engine +"\n"+id+"\n"+amountOfSeats);
   }

    public Airplane copy(int id){
        Airplane newPlane= new Airplane();
        newPlane.setId(id);
        newPlane.setAmountOfSeats(this.getAmountOfSeats());
        newPlane.setEngine(this.getEngine());

        return  newPlane;

            }
}
