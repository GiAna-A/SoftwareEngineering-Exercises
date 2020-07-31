package spielwiese.src.duplikateFinden;

public class Professor extends UniMitglied{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void printID(){
        System.out.println(id);
    }
}
