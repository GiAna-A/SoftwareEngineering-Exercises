package spielwiese.src.dependencyInjection;

import java.util.Arrays;
import java.util.List;

public class MaedelDB implements DB {
    List<Maedel> list = Arrays.asList(
            new Maedel("Heide", "Horrmeyer"),
            new Maedel("Julia", "Schlauch"));

  /*  @Override
    public void search(String name, String surName) {
        for (Maedel maedel: list) {
            if (maedel.getSurName().equals(surName) && maedel.getName().equals(name)) {
                System.out.println("Gefunden");
                break; //sonst wenn er die andere nicht findet-->nein
            } else{
                System.out.println("Nein");
            }

        }
    }*/


    /*   @Override
       public void search(Maedel maedel) {
           for (Maedel maedel1 : list) {
               if (maedel1.getName().equals(maedel.getName()) && maedel1.getSurName().equals(maedel.getSurName())) {
                   System.out.println("Gefunden");
                   break;

               } else {
                   System.out.println("no");
               }

           }
       }
   */
    @Override
    public void search(Human human) {
        boolean doesContain = false;
        for (Maedel maedel : list) {
            if (human.getName().equals(maedel.getName()) && human.getSurname().equals(maedel.getSurname())) {
                doesContain = true;
                break;
            }
        }
        if (doesContain) {
            System.out.println("Gefunden");
        } else {
            System.out.println("Nein");
        }
    }
}


