package spielwiese2.classcodes.enums.carTaxExample;

public enum CarType {
    DIESEL ("Diesel"){
        public int getTax(int cc){
            return cc/10;
        }
    } ,
    BENZIN ("Benzin"){
        public int getTax(int cc){
            return cc/15;
        }
    };


    String name;
    CarType (String name){
        this.name= name;

    }

    public String getName() {
        return name;
    }

    public abstract int getTax(int cc);
}
