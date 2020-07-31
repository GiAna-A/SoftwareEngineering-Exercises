package spielwiese.reflections.exercise2;

public class Address {
    private int hausnummer;
    private String name;

    @ForeignKey
    private Hall hall;

    public Address(int hausnummer, String name, Hall hall) {
        this.hausnummer = hausnummer;
        this.name = name;
        this.hall = hall;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
