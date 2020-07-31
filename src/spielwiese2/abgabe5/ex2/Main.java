package spielwiese2.abgabe5.ex2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        City city = new City("74523", "Schwäbisch Hall", "BW");
        Address address = new Address(city, "An den Wasenwiesen ", 14);
        Student student = new Student("Tine", address);
        printAttributes(student);

    }

    public static void printAttributes(Object unknownObject) throws IllegalAccessException {

        Field[] fields = unknownObject.getClass().getDeclaredFields();
        System.out.println(unknownObject.getClass().getSimpleName());
        for (Field field : fields) {
            field.setAccessible(true);
            ForeignKey annotation = field.getAnnotation(ForeignKey.class);
            if (annotation != null) {

                printAttributes(field.get(unknownObject));
            } else {
                System.out.println(field.getName() + field.get(unknownObject));
            }

        }

    }
}