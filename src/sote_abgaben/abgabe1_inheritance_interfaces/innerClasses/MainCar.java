package sote_abgaben.abgabe1_inheritance_interfaces.innerClasses;

public class MainCar {
    public static void main(String[] args) {
        //da default werte können Atribute auch weggelassen werden-kein Fehler

        Car carb= new Car.CarBuilder().
                setSpeed(150).
                setMarke("Ferrari").
                setJahrgang(2017).
                build();


        System.out.println(carb.printCarDetails());
    }
}
