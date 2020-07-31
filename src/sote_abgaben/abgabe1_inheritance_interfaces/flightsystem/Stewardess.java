package sote_abgaben.abgabe1_inheritance_interfaces.flightsystem;

public class Stewardess implements Human{
    String[] passengerlist = {"Hans Wieland", "Max Mustermann"};

    private int age;
    private String name;

    public Stewardess(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void seePassengerlist() {
        System.out.println("Dies ist die folgende Passagierliste:");
        for (int i = 0; i < passengerlist.length; i++) {
            System.out.println(passengerlist[i]);

        }
    }

}
