package spielwiese2.classcodes.java8.optional;

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {
        Db db= new Db();

        //Methode aufrufen
        Optional <String> nameFromDb= db.findId(6);
        if(nameFromDb.isPresent()){
            int lengthOfName= nameFromDb.get().length();
            System.out.println(lengthOfName);
        }else{
            System.out.println("Not found name");
        }


        nameFromDb.ifPresent(name-> System.out.println(name));
    }
}
