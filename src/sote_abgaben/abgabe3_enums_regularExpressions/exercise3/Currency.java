package sote_abgaben.abgabe3_enums_regularExpressions.exercise3;

public enum Currency {
    EURO("Euro", 1), DOLLAR("Dollar",0.91), CHF("Schweizerfranken",0.92);

    double kurs;
    String name;

    Currency(String name,double kurs){
        this.kurs=kurs;
        this.name=name;
    }


}
