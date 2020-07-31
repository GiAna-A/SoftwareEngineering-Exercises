package klausuren.wiSe1920.ex9KL;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
// add all Employees
        int totalCost = employees
                .stream()
                .filter(e->e.getPosition()
                        .equals(Position.MANAGER))
                .map(e -> e.getCompanyCar())
                .mapToInt(c -> c.getCostPerMonth())
                .sum();
        System.out.println(totalCost);
        System.out.println("--------------------------");
        System.out.println(getTotalCost(employees));



    }
    public static int getTotalCost(List<Employee>list){
        int sum=0;
        for(Employee e: list){
            if(e.getPosition().equals(Position.MANAGER)){
                sum+= e.getCompanyCar().getCostPerMonth();

            }

        }
        return sum;

    }
}
