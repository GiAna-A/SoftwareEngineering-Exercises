package spielwiese2.classcodes.enums.carTaxExample;

public class Main {
    public static void main(String[] args) {
        Car car= new Car("Audi", CarType.DIESEL);
        Car car2= new Car("Ford", CarType.BENZIN);

        Car [] cars= new Car[2];
        cars [0]= car;
        cars [1]= car2;

        int totalTaxes=0;

        for (int i = 0; i <cars.length ; i++) {
            totalTaxes+= cars[i].getCarType().getTax(2000);


        }
        System.out.println(totalTaxes);

        CarType [] carType2= CarType.values();
        for(CarType c: carType2){
            System.out.println(c.getName());

        }


        CarType carType= CarType.valueOf("DIESEL");
        System.out.println(carType.getName());
    }
}
