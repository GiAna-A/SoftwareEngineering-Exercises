package spielwiese2.classcodes.enums.carTaxExample;

public class Car {
    String name;
    CarType carType;

    public Car(String name, CarType carType) {
        this.name = name;
        this.carType = carType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
