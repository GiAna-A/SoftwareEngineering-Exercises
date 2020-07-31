package spielwiese.instanceOf;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       MMs rockstar= new MMs();
       rockstar.setRockstarName("Ich bin ein Rockstar");
       rockstar.getRockstarName();

       Chocolate hacker= new Chocolate();
       hacker.setHackerName("Ich bin ein Hacker");
       hacker.getHackerName();

       Crispy student= new Crispy();
       student.setMatrikelNummer(465465);
       student.getMatrikelNummer();

        List<Sweets> sweetsList= new ArrayList<>();
        sweetsList.add(rockstar);
        sweetsList.add(student);
        sweetsList.add(hacker);
        for (Sweets index:sweetsList) { //
            if(index instanceof Crispy){
                System.out.println("Ich habe crispy");
                System.out.println(index);

            }

        }
    }
}
