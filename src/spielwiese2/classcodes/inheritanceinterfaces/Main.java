package spielwiese2.classcodes.inheritanceinterfaces;

public class Main {
    public static void main(String[] args) {
        UseCase [] useCases= new UseCase[2];
        useCases[0]= new SeeFlightDetails();
        useCases[1]= new CancelFlight();

        for (int i = 0; i <useCases.length ; i++) {
            System.out.println(useCases[i].getName());

        }
        useCases[1].execute();
    }
}
