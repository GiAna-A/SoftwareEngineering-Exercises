package sote_abgaben.abgabe7_generics.exercise4;

public class AnimalHouse <T> {
    private T animal;
    public void setAnimal(T x) {
        animal = x;
    }
    public T getAnimal() {
        return animal;
    }
}
