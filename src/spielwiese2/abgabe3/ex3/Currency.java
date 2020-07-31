package spielwiese2.abgabe3.ex3;

public enum Currency {
    €(3), $(2), CHF(4);

    double conversionFactor;
    Currency(double conversionFactor){
        this.conversionFactor=conversionFactor;

    }
    public double getConversionFactor(){
        return conversionFactor;
    }

}
