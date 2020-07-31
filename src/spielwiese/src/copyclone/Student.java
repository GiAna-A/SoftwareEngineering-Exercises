package spielwiese.src.copyclone;

public class Student {
    private String studiengang;
    private int matrikel;

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public int getMatrikel() {
        return matrikel;
    }

    public void setMatrikel(int matrikel) {
        this.matrikel = matrikel;
    }

   public void print(){
       System.out.println("Studiengang: "+ studiengang+ "Matrikelnummer: "+ matrikel
       );
   }
    //Kopie aber id anders-->Konstruktor
    public Student copy(int matrikel){
        Student student= new Student();
        student.setMatrikel(matrikel);
        student.setStudiengang(this.studiengang);
        return student;
    }

}
