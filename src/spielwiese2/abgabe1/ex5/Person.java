package spielwiese2.abgabe1.ex5;

public abstract class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract boolean seeFlightDetails();
    public abstract boolean seePassengerList();
    public abstract boolean cancelFlight();

}
