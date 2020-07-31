package spielwiese2.abgabe1.ex5;

public class Main {
    public static void main(String[] args) {
        Pilo pilo=new Pilo();
        pilo.setName("Max\n");

        CrewMember crewMember= new CrewMember();
        crewMember.setName("Peter\n");

        Passenger passenger= new Passenger();
        passenger.setName("Carl\n");

        Person [] persons= new Person[3];
        persons[0]= pilo;
        persons[1]= crewMember;
        persons[2]= passenger;

        System.out.println("List for aviation regulatory");
        for (int i = 0; i <persons.length ; i++) {
            System.out.println(persons[i].getName());
            System.out.println("Can cancel Flight\n"+ persons[i].cancelFlight());
            System.out.println("Can see PassengerList\n"+ persons[i].seePassengerList());

        }
    }
}
