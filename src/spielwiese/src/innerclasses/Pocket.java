package spielwiese.src.innerclasses;

public class Pocket {

    private String colour;

    public Pocket(String colour) {
        this.colour=colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

   static class Money {
        private int münzen;

       public Money(int münzen) {
           this.münzen=münzen;
       }

       public int getMünzen() {
            return münzen;
        }

        public void setMünzen(int münzen) {
            this.münzen = münzen;
        }
    }

    /*public static void main(String[] args) {
        Pocket pocket = new Pocket();
        pocket.setColour("red");

        /*
        if class Money static-->compile error
        Objekt von Klasse Money kann nicht erzeugt werden
         */
       /*Money money= pocket.new Money();
        money.setMünzen(100);
        System.out.println(pocket.getColour()+ money.getMünzen());
    }*/

    }

