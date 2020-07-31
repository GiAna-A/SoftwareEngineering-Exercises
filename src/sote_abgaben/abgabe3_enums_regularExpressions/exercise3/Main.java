package sote_abgaben.abgabe3_enums_regularExpressions.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Bitte geben Sie die Geldmenge, die Sie in Euro wechseln möchten: ");
        Scanner sc= new Scanner(System.in);
        int amount =sc.nextInt();
        Cost cost = new Cost(amount, Currency.DOLLAR);

        double amountInCurrency= cost.getAmountInCurrency(Currency.EURO);
        System.out.println(amountInCurrency);
    }
}
