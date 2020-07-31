package sote_abgaben.abgabe2_polymorphism.exercise1;

public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        pilot.setName("Max ");
        pilot.setPostion(" ist ein Pilot");
        pilot.setId(1);


        Employee employee = new Employee();
        employee.setName("Tina ");
        employee.setPostion(" ist Stewardess");

        Human[] passengerlist = new Human[4];

        passengerlist[0] = employee;
        passengerlist[1] = pilot;
        passengerlist[2] = pilot;
        passengerlist[3] = employee;
        for (int i = 0; i < passengerlist.length; i++) {
            passengerlist[i].printName();
            //damit werden die Positionen ausgegeben, deshalb kann nicht zu Pilot oder Human gecastet werden
            //denn Methode zur Ausgabe der Postionen befindet sich in CrewMember Klasse
            if (passengerlist[i] instanceof CrewMember) {
                CrewMember passengerListinLoop = (CrewMember) passengerlist[i];
                passengerListinLoop.printPosition();
            }
        }
        findDuplikate(passengerlist);
    }


    public static void findDuplikate(Human[] passengerlist) {
        for (int i = 0; i < passengerlist.length - 1; ++i) {
            for (int j = i + 1; j < passengerlist.length; ++j) {
                if (passengerlist[i] == passengerlist[j]) {
                    System.out.println("Duplikat vorhanden, nochmals Eingabe überprüfen.");

                }

            }

        }


    }

}






