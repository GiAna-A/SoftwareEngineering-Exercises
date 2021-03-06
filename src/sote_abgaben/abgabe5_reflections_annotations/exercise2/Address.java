package sote_abgaben.abgabe5_reflections_annotations.exercise2;

public class Address {


    private String street;
    private int houseNumber;
    @ForeignKey
    private City city;

    public Address(City city, String street, int housenumber){
        this.city=city;
        this.street=street;
        this.houseNumber=housenumber;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }



}
