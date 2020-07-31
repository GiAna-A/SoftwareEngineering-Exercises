package spielwiese2.classcodes.inheritanceinterfaces;

public class CancelFlight implements UseCase {

    String name= "Cancel Flight";
    @Override
    public void execute() {
        System.out.println("Cancel Flight");
    }

    @Override
    public String getName() {
        return name;
    }
}
