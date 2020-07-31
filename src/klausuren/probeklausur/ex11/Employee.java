package klausuren.probeklausur.ex11;

public class Employee {
    int salary;
    int age;
    String name;

    public Employee(int salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
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



    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
