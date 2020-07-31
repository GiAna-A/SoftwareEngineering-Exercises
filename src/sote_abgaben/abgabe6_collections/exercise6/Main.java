package sote_abgaben.abgabe6_collections.exercise6;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Passenger passengerA = new Passenger("Zara", "Horrmeyer", 21);
        Passenger passengerB = new Passenger("Julia", "Schlauch", 20);
        Passenger passengerC = new Passenger("Julia", "Horrmeyer", 15);
        Passenger passengerD = new Passenger("La", "Schlauch", 85);

        System.out.println("------------------------------------\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Alphabetische Reihenfolge, 2: Nach Alter ordnen");

        int decision = scanner.nextInt();

        SortedSet<Passenger> passengerTreeSet = null;

        switch (decision) {
            case 1:
                passengerTreeSet = new TreeSet<>();
                break;
            case 2:
                passengerTreeSet = new TreeSet<>(new PassengerAgeComparator());
                break;
        }
        System.out.println("------------------------------------\n");
        passengerTreeSet.add(passengerA);
        passengerTreeSet.add(passengerB);
        passengerTreeSet.add(passengerC);
        passengerTreeSet.add(passengerD);

       for (Passenger passenger : passengerTreeSet) {
            System.out.println(passenger);
        }
        System.out.println("hasEntereds\n");

        Map<Passenger, Boolean> hasEnteredPlane = new HashMap<>();
        hasEnteredPlane.put(passengerA, true);
        hasEnteredPlane.put(passengerB, false);
        hasEnteredPlane.put(passengerC, true);

        Set<Passenger> passengerSet= hasEnteredPlane.keySet();
        for(Passenger passenger:passengerSet){
            System.out.println(passenger+ " : " + hasEnteredPlane.get(passenger));
        }




    }
}
