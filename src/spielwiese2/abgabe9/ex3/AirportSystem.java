package spielwiese2.abgabe9.ex3;

import java.util.*;

public class AirportSystem {
    public static void main(String[] args) throws NotAllowedToViewListException {
        List<Human> passengerList = new ArrayList<>();
        Passenger passengerA = new Passenger("Amelia", 16);
        Pilot pilotA = new Pilot("Viki", 24);
        CrewMember crewMemberA = new CrewMember("Angela", 27);
        passengerList.add(passengerA);
        passengerList.add(pilotA);
        passengerList.add(crewMemberA);

        printPassengerList(pilotA);
    }

    public static void printPassengerList(Human human) throws NotAllowedToViewListException {
        List<Human> passengerList = new ArrayList<>();
        Passenger passengerA = new Passenger("Amelia", 16);
        Passenger passengerB = new Passenger("Viki", 24);
        Passenger passengerC = new Passenger("FatihMuffel", 27);
        passengerList.add(passengerA);
        passengerList.add(passengerB);
        passengerList.add(passengerC);

        if (human instanceof Pilot) {
            for (Human p:passengerList){
                System.out.println(p.getName()+p.getAge());
            }
        } else if (human instanceof CrewMember) {
            for (Human p : passengerList) {
                System.out.println(p.getName());
            }


        } else if (human instanceof Passenger) {
            throw new NotAllowedToViewListException("You are not allowed to view passenger list.");
        }

    }
}
