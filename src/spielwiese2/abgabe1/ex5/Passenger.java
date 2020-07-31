package spielwiese2.abgabe1.ex5;

public class Passenger extends Person {

    @Override
    public boolean seeFlightDetails() {
        return true;
    }

    @Override
    public boolean seePassengerList() {
        return false;
    }

    @Override
    public boolean cancelFlight() {
        return false;
    }
}
