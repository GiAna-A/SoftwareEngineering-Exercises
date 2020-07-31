package sote_abgaben.abgabe5_reflections_annotations.exercise2;

import java.lang.reflect.Field;


public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        //Instanzen erstellen
        City city = new City("78467", "Petershausen", "BW");
        Address address = new Address(city, "Gustav-Schwab- Straße", 7);
        Student student = new Student("Max Mustermann", address);
        printObjectsAttributes(student);
    }

    private static void printObjectsAttributes(Object object) throws IllegalAccessException {

        // Klassennamen speichern als String und ausgeben lassen
      
        //mit array alle Variablen durchgehen
        Field [] fields= object.getClass().getDeclaredFields();
        System.out.println(">  "+object.getClass().getSimpleName());
        //mit for durch array gehen
        for (Field field:fields) {
            field.setAccessible(true); //weil Variable private sind und man aber darauf zugreifen will
            ForeignKey annotation= field.getAnnotation(ForeignKey.class); //einen Marker setzen die Methode wird in anderer Klasse durchgeführt
            if(annotation!=null){
                printObjectsAttributes(field.get(object));
            }else{
                System.out.println(field.getName()+": " + field.get(object));
            }
        }
        //zu anderen Klassen kommt man durch den FK durch Annotation kann dieser gekennzeichnet werden
        // rekursiv: wenn keine Annotation ausprinten wenn doch dann in Klasse springen


    }


}




