package spielwiese2.abgabe2.ex1;

public class Main {
    public static void main(String[] args) {
        CrewMember c= new CrewMember();
        c.setName("Tina");
        c.seePassengerList();

        Pilot p= new Pilot();
        p.setName("Bernd");
        p.allowedToFly();



        Human [] humans= new Human[2];
        humans[0]= c;
        humans[1]=p;


        for (int i = 0; i <humans.length ; i++) {
            System.out.println(humans[i].getName());

        }
        findDuplicates(humans);
    }
    public static void findDuplicates (Human [] humans){
        for (int i = 0; i <humans.length-1 ; ++i) {
            for (int j = i+1; j < humans.length; ++j) {
                if(humans[i]==humans[j]){
                    System.out.println("Achtung Duplikate");

                }
            }

        }
    }
}
