package spielwiese.src.duplikateFinden;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.setName("Langweg");
        prof.setId(1234);


        Student student = new Student();
        student.setName("Heide");
        student.setMatrikelnummer(298563);

       /* List<UniMitglied> list = Arrays.asList();
        list.add(prof);
        list.add(student);
        list.add(prof);*/




        //Liste erstellen
        UniMitglied[] uniMitglieds = new UniMitglied[3];
        uniMitglieds[0] = prof;
        uniMitglieds[1] = student;
        uniMitglieds[2] = prof;

        for (int i = 0; i < uniMitglieds.length; i++) {
            uniMitglieds[i].printName();
            if(uniMitglieds[i] instanceof Professor) {
                Professor professor = (Professor) uniMitglieds[i];
                professor.printID();
            }else if(uniMitglieds [i] instanceof Student){

                Student student1= (Student) uniMitglieds[i];
                student1.printMatrikelnummer();
            }
        }
        Duplikat duplikat= new Duplikat();
        duplikat.findeDuplikate(uniMitglieds);


    }

    /*public  static void findeDuplikate(UniMitglied[] uniMitglieds) {
        for (int i = 0; i < uniMitglieds.length; i++) {
            for (int j = i + 1; j < uniMitglieds.length; j++) {
                if (uniMitglieds[i] == uniMitglieds[j]) {
                    System.out.println("Duplikat gefunden!");

                }

            }

        }
    }*/


}
