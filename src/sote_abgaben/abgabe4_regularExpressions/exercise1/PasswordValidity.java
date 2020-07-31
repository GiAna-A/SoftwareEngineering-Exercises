package sote_abgaben.abgabe4_regularExpressions.exercise1;

import java.util.Scanner;

public class PasswordValidity {
    public static void main(String[] args) {

        System.out.println("Bitte um Eingabe: ");
        Scanner sc= new Scanner(System.in);
        String password=sc.next();


        String regEx= "[A-Za-z]{4,14}";

        if (password.matches(regEx)){
            System.out.println("password is valid");

        }else{
            System.out.println("password is not valid");
        }
    }
}
