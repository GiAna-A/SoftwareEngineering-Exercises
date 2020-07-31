package spielwiese2.classcodes.polymorphismus;

public class Bus extends MotorizedVehicle {
    protected String typeOfBus;

    public String getTypeOfBus() {
        return typeOfBus;
    }

    public Bus(int id, int amouuntOfSeats, int power, String typeOfBus){
        super(id, amouuntOfSeats,power);
        this.typeOfBus=typeOfBus;

    }
    @Override
    public String toString(){
        String motorizedString= super.toString();
        return motorizedString +typeOfBus;
    }
}
