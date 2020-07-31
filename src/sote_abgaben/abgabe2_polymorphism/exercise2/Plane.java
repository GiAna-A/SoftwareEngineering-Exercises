package sote_abgaben.abgabe2_polymorphism.exercise2;

public class Plane {
    private int id;
    private int amountOfSeats;
    private String engine;

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

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void print (){
        System.out.println( id +"\n"+ amountOfSeats+ "\n"+engine);
    }

     public Plane copy (int id){
        Plane newPlane = new Plane();
        newPlane.setId(id);
        newPlane.setAmountOfSeats(this.getAmountOfSeats());
        newPlane.setEngine(this.getEngine());
        return newPlane;
    }
}
