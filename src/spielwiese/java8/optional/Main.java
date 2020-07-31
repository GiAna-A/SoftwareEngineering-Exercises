package spielwiese.java8.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional <Student> stud= StudentDB.findStudent("Fatih");

        if(stud.isPresent()){
            Student student= stud.get();
        }
    }
}
