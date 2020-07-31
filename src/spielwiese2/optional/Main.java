package spielwiese2.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        DbEmployee dbEmployee = new DbEmployee();
        Optional<Integer> findId= dbEmployee.findId(5);

            if (findId.isPresent()) {

                System.out.println("Employee with id:"+ " "+findId.get()+ " "+ "exists");

            }else {
                System.out.println("Not found");
            }
        System.out.println("---------------------------");
            Optional<Integer> id2= dbEmployee.findId(5);
            id2.ifPresent(id-> System.out.println("this id:"+ " "+id +"exists"));
        }
    }
