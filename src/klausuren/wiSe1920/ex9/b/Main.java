package klausuren.wiSe1920.ex9.b;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("name", 40000, Employee.Position.MANAGER, new Employee.CompanyCar("A8", "Audi", 2000));
        Employee e2 = new Employee("name", 40000, Employee.Position.MANAGER, new Employee.CompanyCar("A4", "Audi", 1000));
        Employee e3 = new Employee("name", 40000, Employee.Position.MANAGER, new Employee.CompanyCar("i8", "BMW", 1000));


        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
// add all Employees
        int totalCost = employees
                .stream()
                .filter(e -> e.getPosition()
                        .equals(Employee.Position.MANAGER))
                .map(e -> e.getCompanyCar())
                .mapToInt(c -> c.getCostPerMonth())
                .sum();
        System.out.println(totalCost);

        //2.
        int sum = 0;
        for (Employee e : employees) {
            if (e.getPosition().equals(Employee.Position.MANAGER)) {
                sum += e.getCompanyCar().getCostPerMonth();
            }
        }
        System.out.println(sum);

        //3.
        List<String> allEmployeeCars =
                employees.stream()
                        .map(employee -> employee.getCompanyCar().getModel())
                        .distinct()
                        .collect(Collectors.toList());


       allEmployeeCars.forEach(employee -> System.out.println(employee));


       long count= employees
               .stream()
               .map(e->e.getCompanyCar().getBrand())
               .distinct()
               .count();
        System.out.println(count);
        System.out.println("----------------------------------------------");


    }
}
