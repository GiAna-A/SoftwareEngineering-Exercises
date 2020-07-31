package sote_abgaben.abgabe5_reflections_annotations.exercise3;


@Entity
public class Student {

    @Id
    @GeneratedValue(generator = "")
    public int id;

    @Column(value = "student_name")
    private String name;

    @Column(value = "student_sur_name")
    private String surname;
    @Column(value = "student_age")
    private int age;

 //   @GeneratedValue(strategy = GeneratedValue.GenerationType.AUTO, generator = "")

    public Student(String name, String surname, int age, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
