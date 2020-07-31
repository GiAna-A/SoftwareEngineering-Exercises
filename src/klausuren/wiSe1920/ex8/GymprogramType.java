package klausuren.wiSe1920.ex8;

public enum GymprogramType {
    BASIC(20.0), SAUNA(40.0), PERSONALTRAINER(80.0);

    double price;

    GymprogramType(double price) {
        this.price = price;

    }
}

