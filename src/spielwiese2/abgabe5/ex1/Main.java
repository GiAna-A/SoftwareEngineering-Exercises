package spielwiese2.abgabe5.ex1;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        printAttributes(Student.class);

    }
    public static void printAttributes(Class clazz){
        String clazz1=clazz.getSimpleName();

        System.out.println(clazz1);

        Field[] fields= clazz.getDeclaredFields();

        for (Field field:fields ) {
            ForeignKey annotation= field.getAnnotation(ForeignKey.class);
            if(annotation!=null){
                printAttributes(field.getType());
            }else{
                System.out.println(field.getName());
            }



        }

    }
}
