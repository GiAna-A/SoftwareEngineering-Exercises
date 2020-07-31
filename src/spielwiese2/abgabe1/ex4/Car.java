package spielwiese2.abgabe1.ex4;

public class Car {
    String manufacturer;
    int doors;
    int power;

    public Car(){

    }
    public Car( String manufacturer, int doors, int power){
        this.manufacturer=manufacturer;
        this.doors=doors;
        this.power=power;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public String printCarDetails(){
        return  "Manufacturer: " + this.manufacturer +
                " \npower: " + this.power +
                " \ndoors : " + this.doors;

    }
    static class CarBuilder{
        private String manufacturer;
        private int doors;
        private int power;
        public CarBuilder setManufacturer(String manufacturer){
            this.manufacturer=manufacturer;
            return this;
        }
        public CarBuilder setDoors(int doors){
            this.doors=doors;
            return  this;
        }
        public CarBuilder setPower(int power){
            this.power=power;
            return  this;
        }
        public Car build(){
            return new Car(manufacturer,doors,power);
        }

    }
}
