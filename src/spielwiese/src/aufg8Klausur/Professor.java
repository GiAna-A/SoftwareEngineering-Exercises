package spielwiese.src.aufg8Klausur;

public class Professor implements Comparable<Professor> {

    private Integer age;
    private String name;

    public Professor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Professor o) {
        return this.age.compareTo(o.getAge());
    }

    @Override
    public String toString() {
        return "Professor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
