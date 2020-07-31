package klausuren.wiSe1920.ex5al;

public class Employee implements Comparable<Employee>{

    Integer salary;
    String name;

    public Employee(Integer salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee other) {
        return this.salary.compareTo(other.salary);
    }
}
