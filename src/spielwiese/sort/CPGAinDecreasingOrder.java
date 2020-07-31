package spielwiese.sort;

import java.util.Comparator;

public class CPGAinDecreasingOrder implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getCgpa() == o2.getCgpa()) {
            return o1.getFname().compareTo(o2.getFname());
        } else {
            return o1.getCgpa().compareTo(o2.getCgpa());
        }
    }
}

