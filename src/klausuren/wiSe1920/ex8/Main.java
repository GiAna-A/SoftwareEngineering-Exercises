package klausuren.wiSe1920.ex8;

public class Main {
    public static void main(String[] args) {
        GymCost gymCosts = new GymCost();
        double costs = gymCosts.getCosts(GymprogramType.BASIC, DiscountType.STUDENT);
        System.out.println(costs);
    }
}
