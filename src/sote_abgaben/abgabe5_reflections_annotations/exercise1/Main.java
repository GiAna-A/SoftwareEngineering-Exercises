package sote_abgaben.abgabe5_reflections_annotations.exercise1;

import java.lang.reflect.Field;


public class Main {

    public static void main(String[] args) {
        printObjectsAttributes(Student.class);
    }

    private static void printObjectsAttributes(Class clazz) {
        // Klassennamen speichern als String und ausgeben lassen
        String clazz2= clazz.getSimpleName();
        System.out.println(clazz2);

        //mit array alle Variablen durchgehen
        Field [] fields= clazz.getDeclaredFields();
        //mit for durch array gehen
        for (Field field: fields ) {
            //zu anderen Klassen kommt man durch den FK der als Marker gesetzt wird
            // rekursiv: wenn keine Annotation ausprinten wenn doch dann in Klasse springen
            ForeignKey annotation= field.getAnnotation(ForeignKey.class);
            if(annotation!=null){
                printObjectsAttributes(field.getType());
            } else{
                System.out.println(field.getName());
            }
        }



    }
}



