package sote_abgaben.abgabe9_junittesting.exercise3;

import sote_abgaben.abgabe1_inheritance_interfaces.flightsystem.Human;
import sote_abgaben.abgabe1_inheritance_interfaces.flightsystem.Passenger;
import sote_abgaben.abgabe1_inheritance_interfaces.flightsystem.Pilot;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static sote_abgaben.abgabe9_junittesting.exercise3.AirportSystem.printPassengerList;


public class AirportSystemTest {
    private static List<Human> passengerlist = new ArrayList<>(); //interface Human
    private static Passenger passenger = new Passenger("Jerome", 21);
    private static Pilot pilot= new Pilot ("Hans", 32);


    @Test(expected = NotInPassengerListException.class)
    public void printPassengerListTest() throws NotInPassengerListException {
        //given
        printPassengerList(passenger);
    }



}