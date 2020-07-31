package sote_abgaben.abgabe1_inheritance_interfaces.company;

public class Main {
    public static void main(String[] args) {
        EmployeeA empA = new EmployeeA();
        empA.setSalary(2000);


        EmployeeB empB= new EmployeeB();
        empB.setPayPerHour(10.5);
        empB.setWorkedHours(9);


        EmployeeC empC= new EmployeeC();
        empC.setBonus(300);
        empC.setSalary(2000);


        Person [] allEmployees= new Person[3];
        allEmployees[0]=empA;
        allEmployees[1]=empB;
        allEmployees[2]=empC;

        double totalSalary=0;

        for (int i = 0; i <allEmployees.length ; i++) {
            System.out.println(allEmployees[i].getSalary());
            totalSalary+=allEmployees[i].getSalary();
        }
        System.out.println(totalSalary);

    }

}
