package spielwiese2.classcodes.polymorphismus;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(1, 15, 120, "Schoolbus");
        MotorizedVehicle motorizedVehicle = new MotorizedVehicle(2, 5, 150);

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = bus;
        vehicles[0] = motorizedVehicle;

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Bus) {
                Bus busInLoop = (Bus) vehicles[i];
                System.out.println(busInLoop.getTypeOfBus());
            }


        }

    }
    public static boolean addVehicle (Vehicle[] vehicles, Vehicle vehicleToAdd){
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i]==null){

            }
                boolean isInSystem=vehicles[i].equals(vehicleToAdd);
                if (isInSystem){
                    return false;
                }else{
                    vehicles[i]=vehicleToAdd;
            }

        }
        return true;
    }
}
