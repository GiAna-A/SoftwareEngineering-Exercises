package klausuren.wiSe1920.ex8;

public class GymCost {

    public double getCosts(GymprogramType gymprogramType, DiscountType discountType) {

        return gymprogramType.price*discountType.discount;
    }
}
