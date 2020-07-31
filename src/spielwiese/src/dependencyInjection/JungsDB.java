package spielwiese.src.dependencyInjection;

import java.util.Arrays;
import java.util.List;

public class JungsDB implements DB {
    private List<Junge> list = Arrays.asList(new Junge("Lukas", "Hallo"));

    @Override
    public void search(Human human) {
        boolean doesContain = false;
        for (Junge junge : list) {
            if (human.getName().equals(junge.getName()) && human.getSurname().equals(junge.getSurname())) {
                doesContain = true;
            }
        }

        if (doesContain) {
            System.out.println("Gefunden");
        } else {
            System.out.println("Nein");
        }
    }


}
