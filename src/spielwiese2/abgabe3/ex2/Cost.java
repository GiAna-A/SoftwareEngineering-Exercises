package spielwiese2.abgabe3.ex2;

import spielwiese2.abgabe3.ex3.Currency;

public class Cost {
    int amount;
    Currency currency;

    public Cost(int amount, Currency currency){
        this.amount=amount;
        this.currency=currency;

    }
    public double getAmountInCurrency(Currency currency){
        return amount*this.currency.getConversionFactor();
    }
}
