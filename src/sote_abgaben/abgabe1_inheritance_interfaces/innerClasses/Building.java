package sote_abgaben.abgabe1_inheritance_interfaces.innerClasses;

public class Building {
    String building;
    public void setBuilding(String building){
        this.building=building;
    }
    public String getBuilding(){

        return building;
    }

    private class Room { //innere Klasse

        String room="Zimmer 10";

        void output() {

            System.out.println(room );
        }
    }

    public static void main(String [] args) {

        Building building= new Building();
        building.setBuilding("Wohnheim Paradies");
        System.out.println(building.getBuilding());

        new Building().new Room().output();
    }

}
