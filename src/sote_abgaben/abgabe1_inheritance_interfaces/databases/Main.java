package sote_abgaben.abgabe1_inheritance_interfaces.databases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DBWriter selectedDb=null;
       // DBWriter selectedDb=new DBWriter(new Vegetable());



        System.out.println("Welche Datenbank?");
        Scanner sc= new Scanner(System.in);

       int userSelection=sc.nextInt();

       if(userSelection==1){
           selectedDb=new DBWriter(new Fruit());

       }else if(userSelection==2)
            selectedDb= new DBWriter(new Vegetable());


        System.out.println("Nach welcher Frucht oder Gemüse suchen Sie?");
        String whichFruitOrVegetable= sc.next();

        selectedDb.searchDatabase(whichFruitOrVegetable);
    }


}
