package spielwiese2.classcodes.exceptions.ex1;

public class Main {
    public static void main(String[] args) throws NoCountryCodeInListException {
        VatDB vatDB= new VatDB();
        Integer vat;
        vatDB.connect();
      //  vatDB.connect();

        vatDB.getCountryCode("Konstanz");


        try{
            vat= vatDB.getCountryCode("Konstanz");
        }catch (NoCountryCodeInListException e){
            System.out.println("Not in Db");
        }finally {
            vatDB.disconnect();
        }

    }
}
