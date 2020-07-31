package spielwiese2.abgabe3.ex3;

import spielwiese2.abgabe3.ex2.Cost;

public class Main1 {
    public static void main(String[] args) {
        Cost cost= new Cost(5, Currency.$);
        double amountInCurrency= cost.getAmountInCurrency(Currency.€);
        System.out.println(amountInCurrency);
    }
}
