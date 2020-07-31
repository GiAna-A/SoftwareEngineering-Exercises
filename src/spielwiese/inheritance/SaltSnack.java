package spielwiese.inheritance;

public class SaltSnack extends Snack {
    private String saltSnack;

    public SaltSnack(String name, int kalorien) {
        super(name, kalorien);
    }

    public String getSaltSnack() {
        return saltSnack;
    }

    public void setSaltSnack(String saltSnack) {
        this.saltSnack = saltSnack;
    }
}
