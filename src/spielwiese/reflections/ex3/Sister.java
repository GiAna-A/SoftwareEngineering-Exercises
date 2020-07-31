package spielwiese.reflections.ex3;

@Entity
public class Sister {

    @Id
    private int id;

    @Column(value = "sister_name")
    private String name;
    @Column(value = "sister_surName")
    private String surName;
    @Column(value = "sister_age")
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
