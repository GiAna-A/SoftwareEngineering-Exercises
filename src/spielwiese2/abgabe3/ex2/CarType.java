package spielwiese2.abgabe3.ex2;

public enum CarType {
    DIESEL ("Diesel",Unit.L), ELEKTISCH("Elektrisch", Unit.KWH),PETROL("Petrol", Unit.L);

    String name;
    Unit unit;
     CarType(String name, Unit unit){
         this.name=name;
         this.unit=unit;

    }

    public String getName() {
        return name;
    }

    public Unit getUnit() {
        return unit;
    }
}
