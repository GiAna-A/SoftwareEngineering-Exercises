package sote_abgaben.abgabe1_inheritance_interfaces.databases;

public class Vegetable implements Database {
    private String[] vegetable= {"Carrots", "Potato", "Paprika"};

    @Override
    public void searchList(String fruitOrVegetables) {
        boolean found =false;
        for (int i = 0; i <vegetable.length ; i++) {
            if (vegetable[i].equals(fruitOrVegetables))   {
                found = true;
            }
        }
        if (found)   {
            System.out.println("Vegetable was found.");
        }else{
            System.out.println("Vegetable was not found");
        }
    }
}
