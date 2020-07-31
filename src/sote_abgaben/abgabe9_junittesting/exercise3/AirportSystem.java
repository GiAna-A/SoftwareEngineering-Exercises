package sote_abgaben.abgabe9_junittesting.exercise3;


import sote_abgaben.abgabe1_inheritance_interfaces.flightsystem.Human;
import sote_abgaben.abgabe1_inheritance_interfaces.flightsystem.Passenger;
import sote_abgaben.abgabe1_inheritance_interfaces.flightsystem.Pilot;
import sote_abgaben.abgabe1_inheritance_interfaces.flightsystem.Stewardess;


import java.util.ArrayList;
import java.util.List;


public class AirportSystem {
    private static List<Human> passengerlist = new ArrayList<>(); //interface Human
    private static Pilot pilot = new Pilot("Fatu", 25);
    private static Passenger passenger = new Passenger("Jerome", 21);
    private static Stewardess crewmember = new Stewardess("Tina", 28);

    public static void printPassengerList(Human human) throws NotInPassengerListException {
        passengerlist.add(pilot);
        passengerlist.add(crewmember);
        passengerlist.add(passenger);
        if (human instanceof Stewardess) { //printe die Liste
            //}else if(pilot instanceof Human){ //liste mit ages ausprinten
            for (Human p : passengerlist) {
                System.out.println(p.getName());
            }

        } else if (human instanceof Pilot) { //Liste mit Alter
            for (Human p : passengerlist) {
                System.out.println(p.getName()+ p.getAge());
            }
        } else if(human instanceof Passenger){
            throw new NotInPassengerListException("Keine Befugnis Liste zu sehen"); //Exception
        }


    }
    //
}
