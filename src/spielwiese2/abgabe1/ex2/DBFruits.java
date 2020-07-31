package spielwiese2.abgabe1.ex2;


public class DBFruits implements DbBlueprint {

    String [] fruits= {"Apple", "Banana"};
    boolean found=false;
    @Override
    public void searchList(String text) {

        for (int i = 0; i <fruits.length ; i++) {
            if (fruits[i].equals(text)){
                found=true;

            }
            }
        if (found){
            System.out.println("Gefunden");

        }else{
            System.out.println("Nope");
        }
    }
}
