package spielwiese2.classcodes.exceptions.ex1;

import java.util.HashMap;
import java.util.Map;

/**
 * saves Countryname and Countrycode in a hashmap. Has method connect () to database and gets CountryCode in a safe way.
 * @author Giana
 */
public class VatDB {
    private int counter=0;
    Map<String, Integer> countryList= new HashMap<>();

    public VatDB(){
        countryList.put("Schwäbisch Hall",74523);
        countryList.put("Konstanz", 78462);
    }
    public void connect() throws TooManyDbConnectionsException {

        if(counter>=1 ){
            throw new TooManyDbConnectionsException("Too many connections with db.");

        }
        counter++;

    }
    public void disconnect(){
        if (counter==1){
            counter--;
        }
        counter--;
    }


    /**
     * gets countryName from database in a safe way.
     * @param countryName
     * @return countryName
     * @throws NoCountryCodeInListException
     */
    public Integer getCountryCode(String countryName) throws NoCountryCodeInListException{
        if(!countryList.containsKey(countryName)){
            throw new NoCountryCodeInListException("The country code is not in list");

        }else{
            return countryList.get(countryName);
        }

    }


}
