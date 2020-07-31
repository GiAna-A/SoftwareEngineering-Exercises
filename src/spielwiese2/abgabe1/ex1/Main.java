package spielwiese2.abgabe1.ex1;

public class Main {
    public static void main(String[] args) {
        TypeA typeA= new TypeA();
        TypeB typeB=new TypeB();
        TypeC typeC = new TypeC();

        Salary [] types= new Salary[3];
        types [0]= typeA;
        types [1]= typeB;
        types [2]= typeC;

        typeB.workedHours=10;
        typeC.employeeOfMonth=true;

        int totalSum=0;
        for (int i = 0; i <types.length ; i++) {
            totalSum+=types[i].getSalary();
        }
        System.out.println(totalSum);
    }


}
