package spielwiese.familyBudget;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String role = "Guest";
        int spend = 2000;


        // initialize an annotation
        Class annotatedClass = FamilyMember.class;
        // get Methods of annotated Class
        Method[] methods = annotatedClass.getMethods();
        for (Method method : methods) {
            FamilyBudget annotation = method.getAnnotation(FamilyBudget.class);
            if (annotation != null) {
                String userRole = annotation.userRole();
                int budget = annotation.budget();
                if (userRole.equals(role)) {
                    if(spend>=budget){
                        System.out.println("Budget Limit over");
                    }else{
                        method.invoke(FamilyMember.class.newInstance(), budget,spend);
                    }

                }

            }
        }
    }
}
