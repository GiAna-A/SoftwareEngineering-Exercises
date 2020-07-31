package spielwiese.reflections;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        printObjectAttributes(Friend.class);
    }


    public static void printObjectAttributes (Class clazz){
        //1. Klassennamen ausgeben
        //Klassennamen werden über getSimpleName geholt und dann als String ausgeben
        String klassenname= clazz.getSimpleName();
        System.out.println(klassenname);

        //hier Attribute von der Klasse holen mit getDeclaredFields,diese im Array vom Typ Field speichern

        Field[] fields = clazz.getDeclaredFields();

        //mit for durch Array gehen
        for (int i = 0; i <fields.length ; i++) {
            //wie kommt man zu anderen Klassen ?- durch Annotaion->FK, mit array FK aus klassen holen
            ForeignKey foreignKey= fields[i].getAnnotation(ForeignKey.class);
            if(foreignKey!=null){
                //wenn Annotaion vorhanden dann Type ausgeben
                printObjectAttributes(fields[i].getType());

        }else{
                System.out.println(fields[i].getName());
            }




        }





    }
}
