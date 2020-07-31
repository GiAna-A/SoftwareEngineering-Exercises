package spielwiese.inheritance;

public class Chocolate extends Sweet{

    private ChocolotyType schokotyp;

    public Chocolate(String name, int kalorien, String sweetType, ChocolotyType schokotyp) {
        super(name, kalorien, sweetType);
        this.schokotyp=schokotyp;
    }

    public ChocolotyType getSchokotyp() {
        return schokotyp;
    }

    public void setSchokotyp(ChocolotyType schokotyp) {
        this.schokotyp = schokotyp;
    }
}
