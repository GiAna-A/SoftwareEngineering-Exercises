package sote_abgaben.abgabe6_collections.exercise6;

import java.util.Comparator;

public class PassengerAgeComparator implements Comparator<Passenger> {
    @Override
    public int compare(Passenger o1, Passenger o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
