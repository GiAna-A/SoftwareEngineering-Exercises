package spielwiese2.abgabe1.ex1;

public class TypeB implements Salary {

    public int workedHours=0;
    @Override
    public int getSalary() {
        return workedHours*12;
    }
}
