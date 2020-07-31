package klausuren.wiSe1920.ex9KL;

public class Employee {
    private String name;
    private int salary;
    private Position position;
    private CompanyCar companyCar;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public CompanyCar getCompanyCar() {
        return companyCar;
    }
    public void setCompanyCar(CompanyCar companyCar) {
        this.companyCar = companyCar;
    }
}
