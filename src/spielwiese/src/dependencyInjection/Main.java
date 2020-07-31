package spielwiese.src.dependencyInjection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Search userSearch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("In welcher DB wollen Sie suchen? \n1: MaedelDB \n2: JungsDB");
        int userSelection = scanner.nextInt();
        System.out.print("Vorname: ");
        String userName = scanner.next();
        System.out.print("Nachname: ");
        String userSurname = scanner.next();
        switch (userSelection) {
            case 1:
                userSearch = new Search(new MaedelDB());
                Maedel maedel = new Maedel(userName, userSurname);
                userSearch.searchList(maedel);
                break;
            case 2:
                userSearch = new Search(new JungsDB());
                Junge junge = new Junge(userName, userSurname);
                userSearch.searchList(junge);
                break;
        }


        //   userSearch.searchList(userSurname, userName);

    }
}
