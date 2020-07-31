package spielwiese2.abgabe8.ex1;

public class Student {
    private String name;
    private String surname;

    public Student(String name, String surname) {
        super();
        this.name = name;
        this.surname = surname;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

