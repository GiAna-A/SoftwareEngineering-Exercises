package sote_abgaben.abgabe2_polymorphism.exercise2;

public class Main {
    public static void main(String[] args) {


        Plane planeA= new Plane();
        planeA.setId(1);
        planeA.setAmountOfSeats(50);
        planeA.setEngine("starker Motor");

        Plane [] planes= new Plane[2];
        planes[0]=planeA;

        Plane planeB= planeA.copy(2);
        planes[1]=planeB;

        for (int i = 0; i <planes.length ; i++) {
            planes[i].print();

        }


    }


}
