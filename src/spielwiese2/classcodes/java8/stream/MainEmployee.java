package spielwiese2.classcodes.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee("May",30, EmployeeType.LABOR,50000));
        employeeList.add(new Employee("Kay",42, EmployeeType.MANAGER,80000));
        employeeList.add(new Employee("Damon",50, EmployeeType.MANAGER,350000));
        employeeList.add(new Employee("Lay",20, EmployeeType.LABOR,10000));

        double sum= employeeList
                .stream()
                .mapToInt(employee->employee.getSalary())
                .sum();


        System.out.println(sum);

        double averageOver40Salary= employeeList
                .stream()
                .filter(employee -> employee.getAge()>40)
                .mapToInt(employee->employee.getSalary())
                .average()
                .orElse(0.0);
        System.out.println(averageOver40Salary);

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("------------------------------------");
        employeeList.forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        });
    }
}
