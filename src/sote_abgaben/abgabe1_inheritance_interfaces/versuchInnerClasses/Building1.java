package sote_abgaben.abgabe1_inheritance_interfaces.versuchInnerClasses;

public class Building1 {
    String name;
    public void setName(String name){

        this.name=name;
    }
    public String getName(){
        return name;
    }

    void my_Method(){ //in method inner class
        int raumNr= 10;
        class InnerClass_Room{
            public void print(){
                System.out.println("Die Zimmernummer lautet"+raumNr);

            }
        }// end of innerclass

        //Acess inner class
        InnerClass_Room room= new InnerClass_Room();
        room.print();
    }

    public static void main(String[] args) {
        Building1 building1= new Building1();
        building1.setName("Wohnheim Paradies");
        System.out.println(building1.getName());
        new Building1().my_Method();

    }
}
