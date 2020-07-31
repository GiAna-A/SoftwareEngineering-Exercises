package sote_abgaben.abgabe1_inheritance_interfaces.innerClasses;

public class Car {
    private int speed;
    private String marke;
    private int jahrgang;


   public Car (int speed, String marke,int jahrgang) {
        super();
        this.speed = speed;
        this.marke = marke;
        this.jahrgang = jahrgang;
    }

   public String printCarDetails(){
        return  "Jahrgang: " + this.jahrgang +
                " \nGeschwindigkeit: " + this.speed +
                " \nMarke: " + this.marke;

    }

        static class CarBuilder{
        private int speed=0;
        private String marke="";
        private int jahrgang=0;

        public CarBuilder(){ }

        public CarBuilder setSpeed(int speed){
            this.speed=speed;
            return this;
        }
        public CarBuilder setMarke(String marke){
            this.marke=marke;
            return this;
        }
            public CarBuilder setJahrgang (int jahrgang){
                this.jahrgang=jahrgang;
                return this;
    }
    public Car build (){
        return new Car(speed, marke, jahrgang);
        }
        }

}