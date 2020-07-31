package sote_abgaben.abgabe6_collections.exercise6;

public class Passenger  implements Comparable<Passenger> {
    private String name;
    private String surname;
    private Integer age; //man kann nur compareTo Methode aufrufen mit Wrapper aufrufen

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Passenger(String name, String surname, Integer age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age=age;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=' "+age+ '\''+
                '}';
    }

    @Override
    public int compareTo(Passenger o) {
        return this.getName().compareTo(o.getName());
    }
}
