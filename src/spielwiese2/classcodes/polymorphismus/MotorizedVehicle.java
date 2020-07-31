package spielwiese2.classcodes.polymorphismus;

public class MotorizedVehicle extends Vehicle {
    protected int power;
    public MotorizedVehicle(int id, int amountOfSeats, int power){
        super(id, amountOfSeats);
        this.power=power;

    }
    @Override
    public String toString(){
        String vehicleString= super.toString();
        return vehicleString+power;
    }
}
