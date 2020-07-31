package klausuren.wiSe1920.ex9.a;

public class CompanyCar implements Comparable<CompanyCar>{
    private String brand;
    private String model;
    private int costPerMonth;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getCostPerMonth() {
        return costPerMonth;
    }
    public void setCostPerMonth(int costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    @Override
    public int compareTo(CompanyCar that) {

        return this.brand.compareTo(that.brand);
    }
}

