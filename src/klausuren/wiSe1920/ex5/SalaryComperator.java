package klausuren.wiSe1920.ex5;


import java.util.Comparator;

public class SalaryComperator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        return e1.getSalary().compareTo(e2.getSalary()) ;
    }
}


