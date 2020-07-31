package sote_abgaben.abgabe7_generics.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //AnimalHouse<Animal> house = new AnimalHouse<Cat>();--->fails to compile, funktioniert nur mit Animal
         //AnimalHouse<Dog> house = new AnimalHouse<Animal>();--->fails to compile, nur mit Dog


        AnimalHouse<Cat> house = new AnimalHouse<Cat>();
        house.setAnimal(new Cat()); //fails to compile->1 Paramerer in setAnimal von T zu Cat wechseln

     //  AnimalHouse house = new AnimalHouse();
       // house.setAnimal(new Dog()); //kein Generics! geht weil Dog von AnimalHouse erbt

    }
}
