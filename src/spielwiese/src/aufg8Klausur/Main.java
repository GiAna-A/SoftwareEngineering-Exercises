package spielwiese.src.aufg8Klausur;

public class Main {
    public static void main(String[] args) {
        Employee employee= new Employee(100, "Fatih");
        Employee employee1= new Employee(20, "Jerome");

        MyList<Employee> employees= new MyList<>();

        employees.add(employee);
        employees.add(employee1);

        System.out.println(employees.getSmallestElement());
        System.out.println(employees.getEldestProf());

        Professor professor= new Professor(50, "Langweg");
        Professor professor1= new Professor(56, "Wäsch");

        MyList<Professor> professors= new MyList<>();
        professors.add(professor);
        professors.add(professor1);

        System.out.println(professors.getEldestProf());

    }
}
