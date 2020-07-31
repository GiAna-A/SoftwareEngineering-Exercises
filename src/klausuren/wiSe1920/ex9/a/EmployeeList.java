package klausuren.wiSe1920.ex9.a;


import klausuren.wiSe1920.ex9KL.Position;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeList {

    public int getTotalCost(){

        Map<Employee, CompanyCar> map= new HashMap<>();
        Set<Employee> set= map.keySet();
        int sum=0;
        for(Employee t: set){
            System.out.println(t);
            if(t.getCompanyCar().equals(Position.MANAGER)){
               sum+=t.getCompanyCar().getCostPerMonth();

            }

        }
        return sum;
    }
}
