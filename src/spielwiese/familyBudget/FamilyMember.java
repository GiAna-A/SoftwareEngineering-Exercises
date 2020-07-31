package spielwiese.familyBudget;

public class FamilyMember {
@FamilyBudget (userRole = "Senior", budget = 1200)
    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

    @FamilyBudget(userRole = "Junior") //hier default budget
    public void juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
//annotaion is null
    public void guestUser(int budget, int moneySpend) {
        System.out.println("Guest Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
    @FamilyBudget
    public void guestUser2(int budget, int moneySpend) {
        System.out.println("Guest Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}
