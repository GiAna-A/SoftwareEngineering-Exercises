package sote_abgaben.abgabe4_regularExpressions.exercise2;

public class EmailAdress {
    public static void main(String[] args) {

        String emailadress = "giana.akimbaev@outlook.de"; //@hgj


        String username = "@";
        String[] usernames = emailadress.split(username); //splittet emailadresse

        System.out.println("username:" + usernames[0]);

        for (int i = 0; emailadress.charAt(i)!='@' ; i++) { //geht buchstabe für buchstabe durch bis zum @
            System.out.print(emailadress.charAt(i));

        }
        //geht es rückwärts durch-->ed.kooltuo bis zum @
        for (int i = emailadress.length()-1; emailadress.charAt(i)!='@' ; i--) {
            System.out.print(emailadress.charAt(i));

        }


    }
}