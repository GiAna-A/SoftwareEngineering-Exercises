package klausuren.wiSe1920.ex5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyList <T> extends ArrayList<T> {
    MyList<Employee> employees= new MyList<>();
    public MyList(){
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

    }

    Employee employee= new Employee("My",30000);
    Employee employee1= new Employee("M",3000);
    Employee employee2= new Employee("M",3000);
    Employee employee3= new Employee("M",3000);


    public void getOccurencesByValue(){
        int counter=0;

           Map<Employee,Integer> mapList= new HashMap<>();

            Set<Employee> integerSet= mapList.keySet();

            for(Employee employee: integerSet){

                if (employee.getSalary().compareTo(employee.getSalary())==0){
                    counter++;
                    System.out.println(employee.getSalary()+ counter);;

                }

            }

        }

    }


