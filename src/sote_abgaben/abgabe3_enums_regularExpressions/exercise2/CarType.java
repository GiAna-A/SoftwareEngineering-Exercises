package sote_abgaben.abgabe3_enums_regularExpressions.exercise2;

public enum CarType {
    DIESEL("Diesel", UnitOfConsumption.L), PETROL("Benzin", UnitOfConsumption.L), ELEKTRISCH("Elektrisch", UnitOfConsumption.KWH);

    String name;
    UnitOfConsumption unit;

    CarType(String name, UnitOfConsumption unit) {
        this.name = name;
        this.unit = unit;

    }

    public String getName() {
        return name;
    }

    public UnitOfConsumption getUnit() {
        return unit;
    }
}


