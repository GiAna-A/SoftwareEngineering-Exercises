package spielwiese2.abgabe1.ex4;

public class Main {
    public static void main(String[] args) {
        Car car= new Car.CarBuilder()
                .setManufacturer("Audi")
                .setDoors(5)
                .setPower(120)
                .build();

        System.out.println(car.printCarDetails());
    }
}
