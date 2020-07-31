package spielwiese2.abgabe1.ex2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Search userDb = null;

        System.out.println("In which db to search? /db 1/ db 2");
        Scanner sc= new Scanner(System.in);
        int userInput= sc.nextInt();
        System.out.println("Which text?");
        String userText= sc.next();

        switch (userInput){
            case 1:
                userDb=  new Search(new DBFruits());
                break;
            case 2:
                userDb=new Search(new DBVegi());
                break;
            default:
                System.out.println("Falscher Wert");
        }
    userDb.search(userText);
    }
}
