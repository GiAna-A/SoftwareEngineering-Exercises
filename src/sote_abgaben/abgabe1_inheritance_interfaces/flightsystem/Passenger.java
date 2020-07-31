package sote_abgaben.abgabe1_inheritance_interfaces.flightsystem;

public class Passenger implements Human {
    public Passenger(String name, int age) {
        this.name = name;
        this.age=age;
    }
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    String flightdetails []= {"11:30am: 102-Switzerland", "15pm: 103- Florida"};

    public void setName (String name){
        this.name=name;
    }


    public String getName() {
        return name;
    }


    public void seeFlightDetails(){
        for (int i = 0; i < flightdetails.length; i++) {
            System.out.println(flightdetails[i]);

        }

    }
}
