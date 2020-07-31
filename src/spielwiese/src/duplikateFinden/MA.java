package spielwiese.src.duplikateFinden;

public class MA extends  UniMitglied{
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void printPosition(){
        System.out.println(position);
    }
}
