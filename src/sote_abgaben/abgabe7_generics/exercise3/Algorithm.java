package sote_abgaben.abgabe7_generics.exercise3;

public final class Algorithm {

    // bei Generics ist das T immer ein Objekt!!


     public static <T> T max(T x, T y) { //T ist ein Objekt,  Objekte können nicht verglichen werden
         return x .equals(y) ? x : y;
     }

    //Operator cannot be applied to T


  //  public <T> algorithm(T x, T y) { //T ist ein Objekt,  Objekte können nicht verglichen werden
    //    return x > y ? x : y;
        //Operator cannot be applied to T
    }


