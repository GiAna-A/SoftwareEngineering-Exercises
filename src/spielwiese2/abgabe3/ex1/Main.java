package spielwiese2.abgabe3.ex1;

public class Main {
    public static void main(String[] args) {
        Month month= Month.JANUARY;
        System.out.println(month.name()+ "has"+month.getAmountOfDays()+"days");

        if(month.in(Season.AUTUMN)){
            System.out.println("This month is in Winter");

        }
    }
}
