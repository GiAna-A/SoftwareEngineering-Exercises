package sote_abgaben.abgabe6_collections.exercise6;

import java.util.Comparator;

public class PassengerAlphabeticalOrderComparator implements Comparator<Passenger> {


    @Override
    public int compare(Passenger o1, Passenger o2) {
        if(o1.getName().compareTo(o2.getName())==0){
            return o1.getAge().compareTo(o2.getAge());
        }
        return o1.getName().compareTo(o2.getName());

    }


}
