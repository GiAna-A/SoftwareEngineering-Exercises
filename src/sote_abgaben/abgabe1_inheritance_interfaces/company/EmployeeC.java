package sote_abgaben.abgabe1_inheritance_interfaces.company;

public class EmployeeC implements Person {
    private double bonus;
    private double salary= getSalary();

    public void setBonus(double bonus){
        this.bonus= bonus;
    }
    public void setSalary (double salary){
        this.salary=salary;
    }

    @Override
    public double getSalary() {
        return salary+ bonus;
    }
}
