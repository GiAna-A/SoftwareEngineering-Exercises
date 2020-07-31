package sote_abgaben.abgabe3_enums_regularExpressions.exercise1;

public class Main {
    public static void main(String[] args) {
        Month month= Month.FEBRUARY;


        System.out.println(month.name() + " has " + month.getAmountOfDays() + " days.");
        if (month.in(Season.WINTER)) {
            System.out.println("This month is in Winter.");
        }

    }

}
