package spielwiese.src.copyclone;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.setStudiengang("BIT");
        stud1.setMatrikel(543535);

        Student [] students= new Student[2];
        students[0]= stud1;

        Student stud2= stud1.copy(2435); //hier wichtig!!
        students[1]= stud2;
        for (int i = 0; i <students.length ; i++) {
            students[i].print();
        }
    }
}
