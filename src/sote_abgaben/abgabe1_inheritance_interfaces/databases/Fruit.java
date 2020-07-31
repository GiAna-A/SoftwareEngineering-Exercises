package sote_abgaben.abgabe1_inheritance_interfaces.databases;

public class Fruit implements Database {
    private String[] fruits= {"Appple", "Orange", "Banana"};

    @Override
    public void searchList(String fruitOrVegetables) {
        boolean found =false;
        for (int i = 0; i <fruits.length ; i++) {
            if (fruits[i].equals(fruitOrVegetables)) {
                found = true;
            }
        }
                if(found){
                    System.out.println("Fruit was found.");

            }else{
                System.out.println("Fruit was not found.");
            }

        }

    }

