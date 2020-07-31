package spielwiese.src.duplikateFinden;

public class Student extends UniMitglied{
    private int matrikelnummer;

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }
    public void printMatrikelnummer(){
        System.out.println(matrikelnummer);
    }
}
