package spielwiese.familyBudget;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) // ->Annotaionen werden zur Laufzeit geholt und dann wird damit etwas gemacht wenn auskommentiert ->kein Komplelierfehler
public @interface FamilyBudget {
    String userRole() default "Guest"; //Methode userRole dh. wenn nutzen dann String reinschreiben wenn nicht dann Guest
    int budget() default 10000;
}
