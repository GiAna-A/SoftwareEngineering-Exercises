package spielwiese2.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DbEmployee {
    List <Integer> idList = new ArrayList<>();

    public DbEmployee(){
        idList.add(2);
        idList.add(3);
        idList.add(4);
    }

    public Optional<Integer> findId(int id){
        if(idList.contains(id)){
            return Optional.of(id);
        }
        return Optional.ofNullable(null);
    }

}
