package spielwiese.sort;

import java.util.Comparator;

public class AlphabeticalOrder implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFname().compareTo(o2.getFname());
    }
}
