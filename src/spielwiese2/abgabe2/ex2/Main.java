package spielwiese2.abgabe2.ex2;

public class Main   {
    public static void main(String[] args) {
        Airplane airplane1= new Airplane();

        airplane1.setId(2);
        airplane1.setEngine("stark");
        airplane1.setAmountOfSeats(60);


        Airplane[] airplanes= new Airplane[2];
        airplanes[0]=airplane1;

        Airplane airplane2=airplane1.copy(8);
        airplanes[1]=airplane2;

        for (int i = 0; i < airplanes.length; i++) {
            airplanes[i].print();

        }

    }
}
