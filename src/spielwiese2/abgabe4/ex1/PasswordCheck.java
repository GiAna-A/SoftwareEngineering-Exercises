package spielwiese2.abgabe4.ex1;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        String regex= "[A-Za-z]{4,14}";
        Scanner sc= new Scanner(System.in);
        String userInput= sc.next();

        if (userInput.matches(regex)){
            System.out.println("Password is valid");

        }else{
            System.out.println("Password is not valid");
        }
    }

}
