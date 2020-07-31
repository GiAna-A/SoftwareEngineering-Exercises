package spielwiese.java8.optional;

import java.util.Optional;

public class StudentDB {

    public static Optional<Student> findStudent(String name) {

        //Studenten erzeugen
        Optional<Student> stud = Optional.of(new Student(20, "Fatih", false, 1236));
        Optional<Student> stud2 = Optional.of(new Student(20, "Samira", true, 246));


        Optional<Student> emptyStud = Optional.empty();
        Optional<Student> studentOptional = Optional.ofNullable(null);

        return null;
    }
}
