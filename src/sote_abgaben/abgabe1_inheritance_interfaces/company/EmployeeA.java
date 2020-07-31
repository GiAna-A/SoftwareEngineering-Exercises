package sote_abgaben.abgabe1_inheritance_interfaces.company;

public class  EmployeeA implements Person{
    private double salary;

    public void setSalary(double salary){
        this.salary=salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
