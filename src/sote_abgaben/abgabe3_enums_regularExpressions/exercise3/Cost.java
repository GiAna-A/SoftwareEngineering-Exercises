package sote_abgaben.abgabe3_enums_regularExpressions.exercise3;


public class Cost {
    Currency currency;
    double amount;

    public Cost(double amount, Currency currency){
    this.currency=currency;
    this.amount=amount;
    }

    public double getAmountInCurrency(Currency currency){

            return amount*this.currency.kurs;

    }
}
