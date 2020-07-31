package sote_abgaben.abgabe5_reflections_annotations.exercise2;

public class Student    {
    private String name;
    @ForeignKey
    private Address address;

   public Student(String name, Address address){
       this.name=name;
       this.address=address;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
