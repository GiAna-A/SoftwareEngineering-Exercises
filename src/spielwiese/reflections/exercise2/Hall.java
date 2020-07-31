package spielwiese.reflections.exercise2;

public class Hall {
    private int zipCode;
    private String stadtteil;

    public Hall(int zipCode, String stadtteil) {
        this.zipCode = zipCode;
        this.stadtteil = stadtteil;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStadtteil() {
        return stadtteil;
    }

    public void setStadtteil(String stadtteil) {
        this.stadtteil = stadtteil;
    }
}
