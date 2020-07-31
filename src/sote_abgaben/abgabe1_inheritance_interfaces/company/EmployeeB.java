package sote_abgaben.abgabe1_inheritance_interfaces.company;

public class EmployeeB implements Person{
    private double workedHours;
    private double payPerHour;


    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }


    @Override
    public double getSalary() {
        return workedHours*payPerHour;
    }
}
