package sote_abgaben.abgabe5_reflections_annotations.exercise3;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        Field[] attributes = Student.class.getDeclaredFields();
        String sql = "CREATE TABLE " + " " + Student.class.getSimpleName() + " (";


        for (Field field : attributes) {
            Column annotation = field.getAnnotation(Column.class);
            Id annotationId = field.getAnnotation(Id.class);
            if (annotationId != null) {
                sql += field.getName() + " int PRIMARY KEY, ";
            }
            if (annotation != null) {
                field.setAccessible(true);
                sql += annotation.value();
                Class<?> type = field.getType();
                if (type.equals(String.class)) {
                    sql += " varchar(255), ";
                } else if (type.equals(int.class)) {
                    sql += " int, ";

                } else {
                    sql += ", ";
                }
            }
        }

        sql = sql.trim().replaceAll(",$", "");
        sql += ");";
        System.out.println(sql);

    }

}
