package sote_abgaben.abgabe5_reflections_annotations.exercise3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Entity {
    public enum GeneratedName{CAPITAL, LOWER, NORMAL};
    GeneratedName generatedName () default  GeneratedName.NORMAL;
}
