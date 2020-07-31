package spielwiese2.classcodes.java8.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Db {
    Map<Integer,String> dbList= new HashMap<>();
    public Db(){
        dbList.put(1, "Mustermann");
        dbList.put(2, "Vero");
        dbList.put(3, "LU");
    }


    public Optional<String>findId(int id){
        if(dbList.containsKey(id)){
            return  Optional.of(dbList.get(id));

        }
        return Optional.empty();

    }


}
