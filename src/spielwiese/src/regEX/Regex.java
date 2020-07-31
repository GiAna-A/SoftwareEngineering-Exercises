package spielwiese.src.regEX;

public class Regex {
    public static void main(String[] args) {
        String websiteEmail= "IchBinSoCool@lul.de";

        String email= "@";
        String email1=".";
        String [] emails= websiteEmail.split(email);

        System.out.println("Der Name der Website:"+ emails[0]);
        System.out.println("Einrichtung:"+ emails [1]);

        for (int i = 0; websiteEmail.charAt(i)!='@'; i++) {
            System.out.print(websiteEmail.charAt(i));
        }
        for (int i = websiteEmail.length()-1; websiteEmail.charAt(i)!='@'; i--) {
            System.out.print(websiteEmail.charAt(i));
        }

    }






}
