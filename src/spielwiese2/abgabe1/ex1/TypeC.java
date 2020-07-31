package spielwiese2.abgabe1.ex1;

public class TypeC implements Salary {
    boolean retiree=false;
    boolean employeeOfMonth=false;
    @Override
    public int getSalary() {
        if (retiree){
            return 3000+200;
        }else if(employeeOfMonth){
            return 3000+100;
        }else{
            return 3000;
        }
    }
}
