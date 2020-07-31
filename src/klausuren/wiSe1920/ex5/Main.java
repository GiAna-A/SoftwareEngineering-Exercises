package klausuren.wiSe1920.ex5;

public class Main {
    public static void main(String[] args) {
        MyList<Employee> employees= new MyList<>();
        employees.add(new Employee("May",30000));
        employees.add(new Employee("Kay",40000));
        employees.add(new Employee("Lay",30000));


        employees.getOccurencesByValue();





    }
}
