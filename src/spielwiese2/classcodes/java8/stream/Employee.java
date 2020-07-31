package spielwiese2.classcodes.java8.stream;

public class Employee {
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                ", salary=" + salary +
                '}';
    }

    int age;
    EmployeeType type;
    int salary;

    public Employee(String name, int age, EmployeeType type, int salary) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }
}
