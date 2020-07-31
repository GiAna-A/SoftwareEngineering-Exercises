package spielwiese.src.methodenaufrufe;

public class Spieler {
    private String name;
    private int spieleinsatz;

    public Spieler(String name) {
        this.name = name;
        this.spieleinsatz = 50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpieleinsatz() {
        return spieleinsatz;
    }

    public void setSpieleinsatz(int spieleinsatz) {
        this.spieleinsatz = spieleinsatz;
    }
}
