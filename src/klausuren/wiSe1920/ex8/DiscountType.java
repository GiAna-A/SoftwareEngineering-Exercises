package klausuren.wiSe1920.ex8;

public enum DiscountType {
    STUDENT(0.5), NO(1), RETIREE(0.8);


    double discount;

    DiscountType(double discount) {
        this.discount = discount;
    }
}
