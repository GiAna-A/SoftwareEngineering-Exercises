package spielwiese.src.aufg8Klausur;

public class Employee implements Comparable<Employee>{

    private Integer gehalt;
    private String name;

    public Employee(int gehalt, String name) {
        this.gehalt = gehalt;
        this.name = name;
    }

    public Integer getGehalt() {
        return gehalt;
    }

    public void setGehalt(Integer gehalt) {
        this.gehalt = gehalt;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "gehalt=" + gehalt +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o1) {
        return this.gehalt.compareTo(o1.getGehalt());
    }


}
