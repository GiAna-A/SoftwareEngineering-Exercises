package spielwiese.reflections.ex3;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {
    //weil hier wird ja in "SQL-Sprache" gesagt was es ist
    public String value();
}
