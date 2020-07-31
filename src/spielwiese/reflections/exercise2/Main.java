package spielwiese.reflections.exercise2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        //erstmal Objekte erzeugen und initialisieren um überhaupt welche holen zu können!
        //von unten nach oben
        Hall hall= new Hall(74523, "Hessental");
        Address address= new Address(14, "An den Wasenwiesen", hall);
        Friend friend = new Friend("Amelia", address);
        //hier kommt methode
        printObjectives(friend);
    }
    public static  void printObjectives(Object object) throws IllegalAccessException {
       //mit array alle Objekte speichern, davon Attribute holen (denn durch diese kann man zu anderen Klassen springen!)
        Field [] fields = object.getClass().getDeclaredFields();
        //ausgeben lassen
        System.out.println(object.getClass().getSimpleName());
        //mit for-loop durchgehen
        for (int i = 0; i <fields.length ; i++) {
            //alle Variablen auf true setzen da sie ja privat sind
            fields[i].setAccessible(true);
            //mit FK kann man in andere Klassen springen
            ForeignKey fk= object.getClass().getAnnotation(ForeignKey.class);
            //mit if prüfen
            if(fk!=null){
                //wenn annotation vorhanden rufe nochmal methode auf speichere neuen WERT in Array ab usw
                printObjectives(fields[i].get(object)); //wenn man get benutz dann exception signature verwenden auch in Main!!

            }else{
                //wenn beendet bei Klasse Hall keine Annotation gib alles bisher gespeicherte aus
                System.out.println(fields[i].getName()+ fields[i].get(object));
            }
        }

    }
}
