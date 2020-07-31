package spielwiese.src.builder;

public class Main {
    public static void main(String[] args) {
        Student stud= new Student.Builder()
                .setAge(25)
                .setName("Heide")
                .build();
    }

}
