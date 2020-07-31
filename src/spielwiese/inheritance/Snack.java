package spielwiese.inheritance;

public class Snack {
    private String name;
    private int kalorien;

    public Snack(String name, int kalorien) {
        this.name = name;
        this.kalorien = kalorien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKalorien() {
        return kalorien;
    }

    public void setKalorien(int kalorien) {
        this.kalorien = kalorien;

    }
}
