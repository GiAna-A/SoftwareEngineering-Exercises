package sote_abgaben.abgabe9_junittesting.exercise3;

import sote_abgaben.abgabe1_inheritance_interfaces.flightsystem.Passenger;
import sote_abgaben.abgabe1_inheritance_interfaces.flightsystem.Pilot;
import sote_abgaben.abgabe1_inheritance_interfaces.flightsystem.Stewardess;

import java.util.Scanner;

import static sote_abgaben.abgabe9_junittesting.exercise3.AirportSystem.printPassengerList;

public class Main {
    public static void main(String[] args) throws NotInPassengerListException {
        Passenger passenger = new Passenger("Harry", 25);
        Pilot pilot = new Pilot("Timothy", 45);
        Stewardess crewmember = new Stewardess("Stacy", 28);

        System.out.println("Bitte eingeben, wer Sie sind: 1: Passenger / 2: Crewmember/ 3: Pilot");
        Scanner sc = new Scanner(System.in);
        int auswahl = sc.nextInt();

        switch (auswahl) {
            case 1:
                printPassengerList(passenger);
                break;
            case 2:
                printPassengerList(crewmember);
                break;
            case 3:
                printPassengerList(pilot);
                break;
            default:
                System.out.println("Bitte Zahl eingeben.");
        }


    }
}
