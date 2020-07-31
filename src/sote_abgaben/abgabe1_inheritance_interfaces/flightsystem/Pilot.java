package sote_abgaben.abgabe1_inheritance_interfaces.flightsystem;

public class Pilot implements Human{
    private int age;
    private String name;
    String flight[] = {"102-Switzerland", "103-Florida"};

    public Pilot(String name, int age) {
        this.name = name;
        this.age=age;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void canCancelFlight() {
        System.out.println("Sie können folgende Flüge canceln");
        for (int i = 0; i < flight.length; i++) {
            System.out.println(flight[i]);

        }

    }


}


