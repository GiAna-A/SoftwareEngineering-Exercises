package spielwiese.inheritance;

public class Sweet extends Snack{
    private String sweetType;

    public Sweet(String name, int kalorien, String sweetType) {
        super(name, kalorien);
        this.sweetType=sweetType;
    }

    public String getSweetType() {
        return sweetType;
    }

    public void setSweetType(String sweetType) {
        this.sweetType = sweetType;
    }
}
