package spielwiese2.classcodes.inheritanceinterfaces;

public class SeeFlightDetails implements UseCase {
    String name= "Flight Details";
    @Override
    public void execute() {
        System.out.println("See Flight Details");
    }

    @Override
    public String getName() {
        return name;
    }
}
