package spielwiese2.abgabe1.ex2;

public class DBVegi implements DbBlueprint {
    String [] vegis= {"Tomato", "Potato"};
    boolean found=false;
    @Override
    public void searchList(String text) {
        for (int i = 0; i <vegis.length ; i++) {
            if (vegis[i].equals(text)) {
                found=true;

        }
        }
        if (found){
            System.out.println("Gefunden");
        }else{
            System.out.println("Falsch");
        }
    }
}
