package spielwiese2.classcodes.polymorphismus;

public class Vehicle {
    public  int id;
    public int amountOfSeats;

    public Vehicle(int id, int amountOfSeats) {
        this.id = id;
        this.amountOfSeats = amountOfSeats;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", amountOfSeats=" + amountOfSeats +
                '}';
    }
}
